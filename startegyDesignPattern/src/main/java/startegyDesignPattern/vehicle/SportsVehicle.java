package startegyDesignPattern.vehicle;

import startegyDesignPattern.strategy.api.DriveStrategy;
import startegyDesignPattern.strategy.impl.SportsDrive;

public class SportsVehicle extends Vehicle{

	public SportsVehicle() {
		super(new SportsDrive());
	}
	
	public void getDriveMode()
	{
		driveStrategy.drive();
	}
}
