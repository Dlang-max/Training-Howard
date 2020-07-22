package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.util.Robot;
import org.firstinspires.ftc.teamcode.util.RobotMap;

public class DriveTrain extends Subsystem {
    private DcMotor lfDrive, lbDrive, rfDrive,rbDrive;
    public DriveTrain() {
        super("DriveTrain");
        lfDrive = Robot.hw.get(DcMotor.class, RobotMap.LEFT_FRONT_ID);
        lbDrive = Robot.hw.get(DcMotor.class, RobotMap.LEFT_BACK_ID);

        rfDrive = Robot.hw.get(DcMotor.class, RobotMap.RIGHT_FRONT_ID);
        rbDrive = Robot.hw.get(DcMotor.class, RobotMap.RIGHT_BACK_ID);

    }
    public void move(double leftPower, double rightPower){
        leftPower = Math.abs(leftPower) * leftPower;
        rightPower = Math.abs(rightPower) * rightPower;

        lbDrive.setPower(leftPower);
        lfDrive.setPower(leftPower);

        rfDrive.setPower(rightPower);
        rbDrive.setPower(rightPower);
    }

    public void tankDrive(){
        move(Robot.g1.left_stick_y, Robot.g1.right_stick_y);
    }

    @Override
    public void run() {
        tankDrive();

    }

    @Override
    public void stop() {
        lbDrive.setPower(0);
        lfDrive.setPower(0);

        rfDrive.setPower(0);
        rbDrive.setPower(0);

    }
}
