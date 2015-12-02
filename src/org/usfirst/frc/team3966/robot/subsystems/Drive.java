
package org.usfirst.frc.team3966.robot.subsystems;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3966.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.Talon;

/**
 * Drive subsystem, controls left and right motors.
 *
 * Supplies methods for controlling the drive by various functions.
 *
 * The motors objects should not be directly set from any other place.
 */
public class Drive extends Subsystem {

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

	Talon rightmotor = new Talon(1); // Right motor #1
	Talon leftmotor = new Talon(0); // Left motor #2

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
