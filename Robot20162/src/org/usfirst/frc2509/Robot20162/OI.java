// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2509.Robot20162;

import org.usfirst.frc2509.Robot20162.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc2509.Robot20162.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton beltIN;
    public JoystickButton beltOut;
    public JoystickButton outBelt;
    public JoystickButton intake1;
    public JoystickButton intake2;
    public JoystickButton relIntake1;
    public JoystickButton relIntake2;
    public JoystickButton shot;
    public JoystickButton shooting1;
    public JoystickButton shooting2;
    public JoystickButton whinchOut;
    public JoystickButton whinchIn;
    public JoystickButton switchCams;
    public Joystick gamepad;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        gamepad = new Joystick(0);
        
        switchCams = new JoystickButton(gamepad, 12);
        switchCams.whenPressed(new SwitchCameras());
        whinchIn = new JoystickButton(gamepad, 6);
        whinchIn.whileHeld(new WinchIn());
        whinchOut = new JoystickButton(gamepad, 8);
        whinchOut.whileHeld(new WinchOut());
        shooting2 = new JoystickButton(gamepad, 1);
        shooting2.whenReleased(new StopShooter());
        shooting1 = new JoystickButton(gamepad, 1);
        shooting1.whileHeld(new StartShooter());
        shot = new JoystickButton(gamepad, 1);
        shot.whenPressed(new Shoot());
        relIntake2 = new JoystickButton(gamepad, 2);
        relIntake2.whenReleased(new ArmUp(0));
        relIntake1 = new JoystickButton(gamepad, 2);
        relIntake1.whenReleased(new BeltStop());
        intake2 = new JoystickButton(gamepad, 2);
        intake2.whileHeld(new ArmDown(0));
        intake1 = new JoystickButton(gamepad, 2);
        intake1.whileHeld(new BeltIn());
        outBelt = new JoystickButton(gamepad, 4);
        outBelt.whileHeld(new BeltOut());
        beltOut = new JoystickButton(gamepad, 7);
        beltOut.whileHeld(new BeltOut());
        beltIN = new JoystickButton(gamepad, 5);
        beltIN.whileHeld(new BeltIn());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Arm Up", new ArmUp());
        SmartDashboard.putData("Arm Down", new ArmDown());
        SmartDashboard.putData("Belt In", new BeltIn());
        SmartDashboard.putData("Belt Out", new BeltOut());
        SmartDashboard.putData("Belt Stop", new BeltStop());
        SmartDashboard.putData("Start Shooter", new StartShooter());
        SmartDashboard.putData("Stop Shooter", new StopShooter());
        SmartDashboard.putData("Winch In", new WinchIn());
        SmartDashboard.putData("Winch Out", new WinchOut());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("DriveForw", new DriveStop());
        SmartDashboard.putData("DriveBack", new DriveBack());
        SmartDashboard.putData("SwitchCameras", new SwitchCameras());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getGamepad() {
        return gamepad;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

