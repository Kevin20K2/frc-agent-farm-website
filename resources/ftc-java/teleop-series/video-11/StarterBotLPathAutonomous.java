package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

/**
 * Encoder and IMU example for a two-motor goBILDA StarterBot.
 * Mission: drive 36 inches at 0 degrees, turn right to -90 degrees,
 * drive 24 inches while holding -90 degrees, then stop.
 *
 * IMPORTANT: Verify the Hub orientation, encoder specification, wheel size,
 * gearing, motor directions, and hardware names on the actual robot.
 */
@Autonomous(name = "StarterBot L Path", group = "StarterBot")
public class StarterBotLPathAutonomous extends LinearOpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private IMU imu;

    private static final RevHubOrientationOnRobot.LogoFacingDirection
            HUB_LOGO_FACING = RevHubOrientationOnRobot.LogoFacingDirection.UP;
    private static final RevHubOrientationOnRobot.UsbFacingDirection
            HUB_USB_FACING = RevHubOrientationOnRobot.UsbFacingDirection.FORWARD;

    // 19.2:1 Yellow Jacket motor and 96 mm drive wheel starting assumptions.
    private static final double COUNTS_PER_MOTOR_REV = 537.7;
    private static final double DRIVE_GEAR_REDUCTION = 1.0;
    private static final double WHEEL_DIAMETER_INCHES = 96.0 / 25.4;
    private static final double COUNTS_PER_INCH =
            (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION)
                    / (WHEEL_DIAMETER_INCHES * Math.PI);

    private static final double DRIVE_POWER = 0.35;
    private static final double DRIVE_GAIN = 0.020;
    private static final double MAX_DRIVE_CORRECTION = 0.18;
    private static final double DRIVE_TIMEOUT_SECONDS = 6.0;

    private static final double TURN_GAIN = 0.015;
    private static final double MAX_TURN_POWER = 0.35;
    private static final double MIN_TURN_POWER = 0.12;
    private static final double HEADING_TOLERANCE = 2.0;
    private static final double TURN_TIMEOUT_SECONDS = 4.0;

    @Override
    public void runOpMode() {
        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        imu = hardwareMap.get(IMU.class, "imu");

        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        imu.initialize(new IMU.Parameters(
                new RevHubOrientationOnRobot(HUB_LOGO_FACING, HUB_USB_FACING)));

        while (opModeInInit()) {
            telemetry.addData("Status", "Robot disabled - check complete route");
            telemetry.addData("Counts/inch", "%.2f", COUNTS_PER_INCH);
            telemetry.addData("Yaw", "%.1f degrees", getHeading());
            telemetry.update();
            idle();
        }

        if (isStopRequested()) {
            return;
        }

        try {
            imu.resetYaw();

            // Keep the mission readable; abort if a segment stops before its target.
            if (!driveStraight(36.0, 0.0, DRIVE_POWER,
                    DRIVE_TIMEOUT_SECONDS, "Leg 1")) {
                return;
            }
            if (!turnToHeading(-90.0, TURN_TIMEOUT_SECONDS)) {
                return;
            }
            driveStraight(24.0, -90.0, DRIVE_POWER,
                    DRIVE_TIMEOUT_SECONDS, "Leg 2");
        } finally {
            stopDrive();
        }
    }

    private boolean driveStraight(double inches, double targetHeading,
                                  double maxPower, double timeoutSeconds,
                                  String segmentName) {
        int moveCounts = (int) Math.round(inches * COUNTS_PER_INCH);
        int leftTarget = leftDrive.getCurrentPosition() + moveCounts;
        int rightTarget = rightDrive.getCurrentPosition() + moveCounts;

        leftDrive.setTargetPosition(leftTarget);
        rightDrive.setTargetPosition(rightTarget);
        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        ElapsedTime timer = new ElapsedTime();
        timer.reset();

        while (opModeIsActive()
                && timer.seconds() < timeoutSeconds
                && (leftDrive.isBusy() || rightDrive.isBusy())) {
            double headingError = getHeadingError(targetHeading);
            double correction = Range.clip(
                    headingError * DRIVE_GAIN,
                    -MAX_DRIVE_CORRECTION,
                    MAX_DRIVE_CORRECTION);

            // A negative error means the robot is left of its target heading.
            // More left power and less right power steer it back to the right.
            double leftPower = maxPower - correction;
            double rightPower = maxPower + correction;

            double scale = Math.max(1.0,
                    Math.max(Math.abs(leftPower), Math.abs(rightPower)));
            leftDrive.setPower(Math.abs(leftPower / scale));
            rightDrive.setPower(Math.abs(rightPower / scale));

            telemetry.addData("Segment", segmentName);
            telemetry.addData("Target counts", "%d : %d", leftTarget, rightTarget);
            telemetry.addData("Current counts", "%d : %d",
                    leftDrive.getCurrentPosition(), rightDrive.getCurrentPosition());
            telemetry.addData("Heading", "target %.1f : current %.1f",
                    targetHeading, getHeading());
            telemetry.addData("Error / correction", "%.1f / %.2f",
                    headingError, correction);
            telemetry.addData("Time", "%.1f / %.1f s",
                    timer.seconds(), timeoutSeconds);
            telemetry.update();
            idle();
        }

        boolean reachedTarget = !leftDrive.isBusy() && !rightDrive.isBusy();
        boolean completed = opModeIsActive()
                && timer.seconds() < timeoutSeconds && reachedTarget;
        stopDrive();
        restoreEncoderMode();
        reportSegmentExit(segmentName, timer, timeoutSeconds, completed);
        return completed;
    }

    private boolean turnToHeading(double targetHeading, double timeoutSeconds) {
        restoreEncoderMode();
        ElapsedTime timer = new ElapsedTime();
        timer.reset();

        double error = getHeadingError(targetHeading);
        while (opModeIsActive()
                && timer.seconds() < timeoutSeconds
                && Math.abs(error) > HEADING_TOLERANCE) {
            error = getHeadingError(targetHeading);
            double turnPower = Range.clip(
                    error * TURN_GAIN,
                    -MAX_TURN_POWER,
                    MAX_TURN_POWER);

            if (Math.abs(turnPower) < MIN_TURN_POWER) {
                turnPower = Math.copySign(MIN_TURN_POWER, error);
            }

            moveRobot(0.0, turnPower);

            telemetry.addData("Segment", "Turn");
            telemetry.addData("Heading", "target %.1f : current %.1f",
                    targetHeading, getHeading());
            telemetry.addData("Error / power", "%.1f / %.2f", error, turnPower);
            telemetry.addData("Time", "%.1f / %.1f s",
                    timer.seconds(), timeoutSeconds);
            telemetry.update();
            idle();
        }

        boolean completed = opModeIsActive()
                && timer.seconds() < timeoutSeconds
                && Math.abs(getHeadingError(targetHeading)) <= HEADING_TOLERANCE;
        stopDrive();
        reportSegmentExit("Turn", timer, timeoutSeconds, completed);
        return completed;
    }

    private void reportSegmentExit(String segmentName, ElapsedTime timer,
                                   double timeoutSeconds, boolean completed) {
        String exitReason;
        if (!opModeIsActive()) {
            exitReason = "Driver Station STOP";
        } else if (timer.seconds() >= timeoutSeconds) {
            exitReason = "Timeout";
        } else if (completed) {
            exitReason = "Target reached";
        } else {
            exitReason = "Target not reached";
        }
        telemetry.addData("Segment", segmentName);
        telemetry.addData("Exit reason", exitReason);
        telemetry.addData("Heading", "%.1f degrees", getHeading());
        telemetry.update();
        sleep(250);
    }

    private double getHeading() {
        return imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);
    }

    private double getHeadingError(double targetHeading) {
        return AngleUnit.normalizeDegrees(targetHeading - getHeading());
    }

    private void moveRobot(double drive, double turn) {
        double leftPower = drive - turn;
        double rightPower = drive + turn;
        double scale = Math.max(1.0,
                Math.max(Math.abs(leftPower), Math.abs(rightPower)));
        leftDrive.setPower(leftPower / scale);
        rightDrive.setPower(rightPower / scale);
    }

    private void restoreEncoderMode() {
        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    private void stopDrive() {
        if (leftDrive != null) {
            leftDrive.setPower(0);
        }
        if (rightDrive != null) {
            rightDrive.setPower(0);
        }
    }
}
