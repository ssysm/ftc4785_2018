package org.firstinspires.ftc.teamcode.sandbox.stages;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.commands.MarkerServo;
import org.firstinspires.ftc.teamcode.commands.MecanumDrive;
import org.firstinspires.ftc.teamcode.commands.VuforiaNavigation;


@Autonomous(name="Claim Auto",group="debug OpMode")
public class ClaimAuto extends LinearOpMode{

    private MecanumDrive mecanumDrive;
    private MarkerServo markerServo;

    @Override
    public void runOpMode() throws InterruptedException{
        mecanumDrive = new MecanumDrive(hardwareMap);
        markerServo = new MarkerServo(hardwareMap);
        waitForStart();

        mecanumDrive.moveParaRight(3000);
        while (mecanumDrive.isMotorBusy());
        mecanumDrive.stopMove();

        markerServo.rotateServo(1);
        Thread.sleep(750);

        markerServo.rotateServo(0);
        Thread.sleep(750);

        markerServo.stopServo();

        mecanumDrive.moveParaLeft(6500);
        while (mecanumDrive.isMotorBusy());
        mecanumDrive.stopMove();
    }


}