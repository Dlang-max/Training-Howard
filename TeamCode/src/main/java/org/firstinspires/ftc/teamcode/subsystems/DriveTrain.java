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

        rfDrive.setPower(-rightPower);
        rbDrive.setPower(-rightPower);
    }
    public void strafeRight(boolean strafeRight) {
        if (strafeRight) {
            lbDrive.setPower(1);
            lfDrive.setPower(-1);

            rfDrive.setPower(-1);
            rbDrive.setPower(1);
        }
    }
    public void strafeLeft(boolean strafeLeft){
        if(strafeLeft){
            lbDrive.setPower(-1);
            lfDrive.setPower(1);

            rfDrive.setPower(1);
            rbDrive.setPower(-1);
        }
    }




    public void tankDrive(){
        move(Robot.g1.left_stick_y, Robot.g1.right_stick_y);
        strafeRight(Robot.g1.right_bumper);
        strafeLeft(Robot.g1.left_bumper);
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
