package org.firstinspires.ftc.teamcode;

import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/*
 * Driver-controlled program for the goBILDA StarterBot chassis and intake.
 *
 * Controls:
 *   Left stick Y  = forward/backward
 *   Right stick X = left/right rotation
 *   Right trigger = intake inward
 *   Left trigger  = intake outward
 */
@TeleOp(name = "StarterBot Chassis Teleop", group = "StarterBot")
public class StarterBotChassisTeleop extends OpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private DcMotor intake;
    private CRServo leftIntakeServo;
    private CRServo rightIntakeServo;

    private double leftPower;
    private double rightPower;
    private double intakePower;

    /*
     * Runs once when the driver presses INIT.
     */
    @Override
    public void init() {
        // These names must exactly match the Robot Controller configuration.
        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        intake = hardwareMap.get(DcMotorEx.class, "intake");
        leftIntakeServo = hardwareMap.get(CRServo.class, "left_intake_servo");
        rightIntakeServo = hardwareMap.get(CRServo.class, "right_intake_servo");

        // Mirrored drive motors normally need opposite software directions.
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);

        // BRAKE reduces coasting when zero power is commanded.
        leftDrive.setZeroPowerBehavior(BRAKE);
        rightDrive.setZeroPowerBehavior(BRAKE);
        intake.setZeroPowerBehavior(BRAKE);

        // Initialize the continuous-rotation servo outputs safely at zero.
        leftIntakeServo.setPower(0.0);
        rightIntakeServo.setPower(0.0);

        // The feeder servos are mirrored, so reverse the right side.
        rightIntakeServo.setDirection(DcMotorSimple.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");
    }

    /*
     * Runs repeatedly after INIT but before START.
     */
    @Override
    public void init_loop() {
        telemetry.addData("Status", "Initialized - waiting for START");
    }

    /*
     * Runs once when the driver presses START.
     */
    @Override
    public void start() {
        telemetry.addData("Status", "Running");
    }

    /*
     * Runs repeatedly after START until STOP.
     */
    @Override
    public void loop() {
        // Split-arcade drive:
        // Left stick Y controls forward/backward.
        // Right stick X controls rotation.
        arcadeDrive(-gamepad1.left_stick_y, gamepad1.right_stick_x);

        // Right trigger runs the intake inward; left trigger reverses it.
        // Equal trigger values cancel each other and command zero power.
        intakePower = gamepad1.right_trigger - gamepad1.left_trigger;

        // Send one calculated intake command to all three intake devices.
        intake.setPower(intakePower);
        leftIntakeServo.setPower(intakePower);
        rightIntakeServo.setPower(intakePower);

        telemetry.addData(
                "Motors",
                "left (%.2f), right (%.2f)",
                leftPower,
                rightPower
        );
        telemetry.addData(
                "Triggers",
                "left (%.2f), right (%.2f)",
                gamepad1.left_trigger,
                gamepad1.right_trigger
        );
        telemetry.addData("Intake Power", "%.2f", intakePower);
    }

    /*
     * Runs once after the driver presses STOP.
     */
    @Override
    public void stop() {
        leftDrive.setPower(0.0);
        rightDrive.setPower(0.0);
        intake.setPower(0.0);
        leftIntakeServo.setPower(0.0);
        rightIntakeServo.setPower(0.0);
    }

    private void arcadeDrive(double forward, double rotate) {
        // Mix forward and rotation into separate left/right commands.
        leftPower = forward + rotate;
        rightPower = forward - rotate;

        // Combined inputs can exceed 1.0. Scale both commands together so
        // their ratio is preserved and neither command exceeds the valid range.
        double maxMagnitude = Math.max(
                1.0,
                Math.max(Math.abs(leftPower), Math.abs(rightPower))
        );

        leftPower /= maxMagnitude;
        rightPower /= maxMagnitude;

        leftDrive.setPower(leftPower);
        rightDrive.setPower(rightPower);
    }
}
