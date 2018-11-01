package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;

import ftclib.subsystems.Subsystem;

public class Climber extends Subsystem {

    DcMotor climb;

    public Climber(HardwareMap ahwMap){
        hwMap = ahwMap;
        //Add actuators and sensors here
        climb = hwMap.dcMotor.get(ActuatorMap.climberMotor);

    }

    public void setClimb(double power) {
        climb.setPower(power);
    }

    public void init(){

    }

    public void stop(){

    }

}
