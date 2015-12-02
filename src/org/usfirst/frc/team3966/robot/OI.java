package org.usfirst.frc.team3966.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    //// DEFINITION OF DRIVE LAYOUT
    // What control style are we using?
    // We have both Joysticks and Game controllers now at our disposal,
    // so let's adapt for both just in case.

    public static boolean controllerEnabled = false;
    
    public Joystick rstick;
    public Joystick lstick;
    public Joystick fstick;
    public Joystick controller;

    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    static {
      if ( !controllerEnabled ) {
        Joystick rstick = new Joystick(0); // Right drive stick
        Joystick lstick = new Joystick(1); // Left drive stick
        Joystick fstick = new Joystick(2); // Arm and superstructure stick
      } else if ( controllerEnabled ) {
        Joystick controller = new Joystick(0); // A single controller for Shrimp
      }
    }
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new TankDrive());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new TankDrive());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new TankDrive());
}
