package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Beginner autonomous example for the 2026-2027 goBILDA StarterBot base.
 * Commands the two-motor drivetrain to travel forward 36 inches, then stops.
 *
 * IMPORTANT: 36 inches is a calculated starting point. Measure the real travel
 * on your robot and calibrate COUNTS_PER_INCH for wheel slip and floor surface.
 */
@Autonomous(name = "StarterBot Drive Forward 3 Feet", group = "StarterBot")
public class StarterBotDriveForwardThreeFeet extends LinearOpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;

    // 19.2:1 Yellow Jacket motor: 537.7 encoder counts per output revolution.
    // StarterBot drive wheel diameter: 96 mm = 96 / 25.4 inches.
    private static final double COUNTS_PER_MOTOR_REV = 537.7;
    private static final double DRIVE_GEAR_REDUCTION = 1.0; // motor to wheel
    private static final double WHEEL_DIAMETER_INCHES = 96.0 / 25.4;
    private static final double COUNTS_PER_INCH =
            (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION)
                    / (WHEEL_DIAMETER_INCHES * Math.PI);

    private static final double DRIVE_DISTANCE_INCHES = 36.0;
    private static final double DRIVE_POWER = 0.35;
    private static final double DRIVE_TIMEOUT_SECONDS = 6.0;

    @Override
    public void runOpMode() {
        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        telemetry.addData("Status", "Ready");
        telemetry.addData("Target", "%.1f inches", DRIVE_DISTANCE_INCHES);
        telemetry.addData("Counts/inch", "%.2f", COUNTS_PER_INCH);
        telemetry.update();

        waitForStart();

        try {
            if (opModeIsActive()) {
                driveStraight(DRIVE_DISTANCE_INCHES, DRIVE_POWER,
                        DRIVE_TIMEOUT_SECONDS);
            }
        } finally {
            stopDrive();
        }
    }

    private void driveStraight(double inches, double power, double timeoutSeconds) {
        int moveCounts = (int) Math.round(inches * COUNTS_PER_INCH);
        int leftTarget = leftDrive.getCurrentPosition() + moveCounts;
        int rightTarget = rightDrive.getCurrentPosition() + moveCounts;

        leftDrive.setTargetPosition(leftTarget);
        rightDrive.setTargetPosition(rightTarget);
        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        leftDrive.setPower(Math.abs(power));
        rightDrive.setPower(Math.abs(power));

        while (opModeIsActive()
                && timer.seconds() < timeoutSeconds
                && (leftDrive.isBusy() || rightDrive.isBusy())) {
            telemetry.addData("Target", "%d : %d", leftTarget, rightTarget);
            telemetry.addData("Current", "%d : %d",
                    leftDrive.getCurrentPosition(), rightDrive.getCurrentPosition());
            telemetry.addData("Time", "%.1f / %.1f s",
                    timer.seconds(), timeoutSeconds);
            telemetry.update();
            idle();
        }

        stopDrive();
        telemetry.addData("Status", "Stopped");
        telemetry.addData("Final", "%d : %d",
                leftDrive.getCurrentPosition(), rightDrive.getCurrentPosition());
        telemetry.update();
        sleep(500);
    }

    private void stopDrive() {
        if (leftDrive != null) {
            leftDrive.setPower(0);
            leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
        if (rightDrive != null) {
            rightDrive.setPower(0);
            rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
    }
}
