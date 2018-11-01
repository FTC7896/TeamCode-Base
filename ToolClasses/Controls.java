package org.firstinspires.ftc.teamcode.ToolClasses;

import com.qualcomm.robotcore.hardware.Gamepad;

public class Controls{

    private Gamepad gamepad1;
    private Gamepad gamepad2;

    public Controls(Gamepad g1, Gamepad g2){
        gamepad1 = g1;
        gamepad2 = g2;
    }

    public double getLeftDrive(){
        return gamepad1.left_stick_y;
    }

    public double getRightDrive(){
        return gamepad1.right_stick_y;
    }

    public double getArmPower(){
        return gamepad2.left_stick_y;
    }

    public double getClimberPower(){
        return gamepad2.right_stick_y;
    }
}
