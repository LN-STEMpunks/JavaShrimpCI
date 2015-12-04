
package org.usfirst.frc.team3966.robot.subsystems;

//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team3966.robot.commands.TankDrive;
import org.usfirst.frc.team3966.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * Drive subsystem, controls left and right motors.
 *
 * Supplies methods for controlling the drive by various functions.
 * The motors objects should not be directly set from any other place.
 */
public class Drive extends Subsystem {

  private static RobotMap robotMap = new RobotMap();

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private static SpeedController leftmotor = new Talon(robotMap.leftmotorpin);

  
  static {
    LiveWindow.addActuator("Drive", "leftmotor", (Talon) leftmotor);
  }
  
  //SpeedController leftmotor = RobotMap.leftmotor;
  SpeedController rightmotor = RobotMap.rightmotor;
  RobotDrive robotdrive = RobotMap.robotdrive;

  public void doNothing() {
    rightmotor.set(0);
    leftmotor.set(0);
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }

  public void TankDrive(double rightmotorspeed, double leftmotorspeed) {
    rightmotor.set(rightmotorspeed);
    leftmotor.set(leftmotorspeed);

  }
}
