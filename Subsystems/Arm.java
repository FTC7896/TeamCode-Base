package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;

import ftclib.subsystems.Subsystem;

public class Arm extends Subsystem {

    DcMotor armMotor;

    public Arm(HardwareMap ahwMap){
        hwMap = ahwMap;
        //Add actuators and sensors here
        armMotor = hwMap.dcMotor.get(ActuatorMap.armMotor);

    }

    public void setArmMotor(double power) {
        armMotor.setPower(power);
    }

    public void init(){

    }

    public void stop(){

    }


}
