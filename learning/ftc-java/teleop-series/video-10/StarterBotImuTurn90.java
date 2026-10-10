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
 * Beginner IMU example for a two-motor goBILDA StarterBot.
 * The robot establishes its starting direction as zero, turns right to
 * -90 degrees, and stops.
 *
 * IMPORTANT: Change HUB_LOGO_FACING and HUB_USB_FACING so they match the
 * physical Control Hub installation on your robot.
 */
@Autonomous(name = "StarterBot IMU Turn Right 90", group = "StarterBot")
public class StarterBotImuTurn90 extends LinearOpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private IMU imu;

    // These sample values describe a Control Hub mounted logo-up with its
    // USB ports facing the agreed front of the robot. Verify before testing.
    private static final RevHubOrientationOnRobot.LogoFacingDirection
            HUB_LOGO_FACING = RevHubOrientationOnRobot.LogoFacingDirection.UP;
    private static final RevHubOrientationOnRobot.UsbFacingDirection
            HUB_USB_FACING = RevHubOrientationOnRobot.UsbFacingDirection.FORWARD;

    private static final double RIGHT_TURN_HEADING = -90.0;
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
        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        IMU.Parameters parameters = new IMU.Parameters(
                new RevHubOrientationOnRobot(HUB_LOGO_FACING, HUB_USB_FACING));
        imu.initialize(parameters);

        // During INIT the motors remain stopped. This telemetry lets the team
        // verify the yaw sign by gently rotating the disabled chassis.
        while (opModeInInit()) {
            telemetry.addData("Status", "Robot disabled - verify IMU orientation");
            telemetry.addData("Yaw", "%.1f degrees", getHeading());
            telemetry.addData("Right-turn target", "%.1f degrees", RIGHT_TURN_HEADING);
            telemetry.update();
            idle();
        }

        if (isStopRequested()) {
            return;
        }

        try {
            // The robot must be level, square to the start line, and still.
            imu.resetYaw();
            turnToHeading(RIGHT_TURN_HEADING, TURN_TIMEOUT_SECONDS);
        } finally {
            stopDrive();
        }
    }

    private void turnToHeading(double targetHeading, double timeoutSeconds) {
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

            // Help the drivetrain overcome static friction while it is still
            // outside the acceptable heading tolerance.
            if (Math.abs(turnPower) < MIN_TURN_POWER) {
                turnPower = Math.copySign(MIN_TURN_POWER, error);
            }

            // Negative turn power produces a clockwise turn with the motor
            // directions used in this example.
            moveRobot(0.0, turnPower);

            telemetry.addData("Target heading", "%.1f", targetHeading);
            telemetry.addData("Current heading", "%.1f", getHeading());
            telemetry.addData("Heading error", "%.1f", error);
            telemetry.addData("Turn power", "%.2f", turnPower);
            telemetry.addData("Time", "%.1f / %.1f s",
                    timer.seconds(), timeoutSeconds);
            telemetry.update();
            idle();
        }

        stopDrive();

        String exitReason;
        if (!opModeIsActive()) {
            exitReason = "Driver Station STOP";
        } else if (timer.seconds() >= timeoutSeconds) {
            exitReason = "Timeout";
        } else {
            exitReason = "Inside heading tolerance";
        }

        telemetry.addData("Status", "Stopped");
        telemetry.addData("Exit reason", exitReason);
        telemetry.addData("Final heading", "%.1f degrees", getHeading());
        telemetry.update();
        sleep(500);
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

    private void stopDrive() {
        if (leftDrive != null) {
            leftDrive.setPower(0);
        }
        if (rightDrive != null) {
            rightDrive.setPower(0);
        }
    }
}
