package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Basic Two Motor TeleOp", group="Iterative Opmode")
public class BasicTwoMotorTeleOp extends LinearOpMode {

    // Declare hardware objects
    private DcMotor leftMotor;
    private DcMotor rightMotor;

    @Override
    public void runOpMode() {
        // INIT Section: Initialize hardware and wait for start
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");

        // Optional: Set motor directions (reverse one if needed for correct drive)
        // leftMotor.setDirection(DcMotor.Direction.FORWARD);
        // rightMotor.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for the driver to press PLAY
        waitForStart();

        // TELEOP Section: Loop while the op mode is active
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                // Get joystick values (left stick Y axis)
                // Note: Joysticks are inverted in FTC, so we negate left_stick_y
                double leftPower = -gamepad1.left_stick_y;
                double rightPower = -gamepad1.right_stick_y;

                // Set motor powers
                leftMotor.setPower(leftPower);
                rightMotor.setPower(rightPower);

                // Optional: Send telemetry data
                telemetry.addData("Left Power", leftPower);
                telemetry.addData("Right Power", rightPower);
                telemetry.update();
            }
        }
    }
}   