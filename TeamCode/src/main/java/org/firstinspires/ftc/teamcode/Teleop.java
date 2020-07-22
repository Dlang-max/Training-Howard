package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.util.Robot;

@TeleOp( name = "Advanced Teleop")
public class Teleop extends OpMode {
    public Robot robot;

    @Override
    public void init() {
        robot = new Robot(hardwareMap, telemetry, gamepad1, gamepad2);

    }

    @Override
    public void loop() {
        robot.run();

    }
    @Override
    public void stop(){
        robot.stop();

    }
}
