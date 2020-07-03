import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp( name = "Basic teleop")
public class BasicTeleop extends OpMode {
    private DcMotor lfDrive, lbDrive, rfDrive,rbDrive;

    @Override
    public void init() {
       lfDrive = hardwareMap.get(DcMotor.class,  "leftFront");
       lbDrive = hardwareMap.get(DcMotor.class,  "leftBack");
       rfDrive = hardwareMap.get(DcMotor.class,  "rightFront");
       rbDrive = hardwareMap.get(DcMotor.class,  "rightBack");
        rfDrive.setDirection(DcMotor.Direction.REVERSE);
        rbDrive.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
//    lfDrive.setPower(0.3);
//    lbDrive.setPower(0.3);
//     rfDrive.setPower(0.3);
//     rbDrive.setPower(0.3);
double rightPower = gamepad1.right_stick_y;
double leftPower = gamepad1.left_stick_y;
lbDrive.setPower(leftPower);
lfDrive.setPower(leftPower);
rfDrive.setPower(rightPower);
rbDrive.setPower(rightPower);


    }
    @Override
    public void stop(){
      lbDrive.setPower(0);
      lfDrive.setPower(0);
      rfDrive.setPower(0);
      rbDrive.setPower(0);


    }
}
