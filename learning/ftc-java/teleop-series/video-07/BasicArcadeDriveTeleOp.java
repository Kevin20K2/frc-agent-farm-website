package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Basic Arcade Drive TeleOp", group="TeleOp")
public class BasicArcadeDriveTeleOp extends LinearOpMode {

    private DcMotor leftMotor;
    private DcMotor rightMotor;

    @Override
    public void runOpMode() {
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");

        // Adjust these directions if your drivetrain is mounted differently.
        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            // Split arcade drive:
            // Left stick Y controls forward/backward.
            // Right stick X controls left/right turning.
            double drive = -gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;

            // Normalize the mixed values so neither exceeds 1.0 in magnitude.
            double denominator = Math.max(
                    Math.abs(drive) + Math.abs(turn),
                    1.0
            );

            double leftPower = (drive + turn) / denominator;
            double rightPower = (drive - turn) / denominator;

            leftMotor.setPower(leftPower);
            rightMotor.setPower(rightPower);

            telemetry.addData("Drive", drive);
            telemetry.addData("Turn", turn);
            telemetry.addData("Left Power", leftPower);
            telemetry.addData("Right Power", rightPower);
            telemetry.update();
        }
    }
}
