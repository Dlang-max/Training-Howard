package org.firstinspires.ftc.teamcode.util;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.DriveTrain;

public class Robot extends RobotBase {

    public DriveTrain driveTrain;


    public Robot(HardwareMap hardwareMap, Telemetry t,
                 Gamepad gamepad1, Gamepad gamepad2) {
        super(hardwareMap, t, gamepad1, gamepad2);
    }

    public Robot(HardwareMap hardwareMap, Telemetry t, Gamepad gamepad1, Gamepad gamepad2, LinearOpMode opMode) {
        super(hardwareMap, t, gamepad1, gamepad2, opMode);
    }

    @Override
    public void initSubsystems() {
        driveTrain = new DriveTrain();


    }
}
