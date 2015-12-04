package org.usfirst.frc.team3966.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public final int rstick = 0;
	public final int lstick = 1;
	public final int fstick = 2;
	
	public final int cstick = 0;
	
	public final int leftmotorpin = 0;
	
	public static SpeedController rightmotor;
	public static RobotDrive robotdrive;
	
	public static void init() {
		rightmotor = new Talon(1);
        LiveWindow.addActuator("Drive", "rightmotor", (Talon) rightmotor);
        
        //robotdrive = new RobotDrive(leftmotor, rightmotor);
        
        //robotdrive.setSafetyEnabled(true);
        //robotdrive.setExpiration(0.1);
        //robotdrive.setSensitivity(0.5);
        //robotdrive.setMaxOutput(0.6);
	}
}
