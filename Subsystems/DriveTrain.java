package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;

import ftclib.subsystems.Subsystem;

public class DriveTrain extends Subsystem {

    DcMotor left;
    DcMotor right;

    public DriveTrain(HardwareMap ahwMap){
        hwMap = ahwMap;
        left=hwMap.dcMotor.get(ActuatorMap.leftDrive);
        right=hwMap.dcMotor.get(ActuatorMap.rightDrive);
    }

    public void drive(double l, double r){

        left.setPower(l);
        right.setPower(r);
    }

    public void init(){

    }

    public void stop(){

    }

}
