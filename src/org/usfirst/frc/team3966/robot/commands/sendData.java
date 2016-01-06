package org.usfirst.frc.team3966.robot.commands;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.hal.PDPJNI;

public class sendData extends Command{

	public static String title;
	public static double lmotorcurrent;
	public static double rmotorcurrent;
	
	public sendData()
	{
		
	}

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putString(title, "SmartDashboard Output");
    	SmartDashboard.putNumber(lmotorcurrent, PDPJNI.getPDPChannelCurrent(1, status));
    	SmartDashboard.putNumber(rmotorcurrent, PDPJNI.getPDPChannelCurrent(15, status));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
