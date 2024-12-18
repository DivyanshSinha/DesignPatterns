package startegyDesignPattern.vehicle;

import startegyDesignPattern.strategy.api.DriveStrategy;
import startegyDesignPattern.strategy.impl.OffroadDrive;

public class OffroadVehicle extends Vehicle{

	public OffroadVehicle() {
		super(new OffroadDrive());
		// TODO Auto-generated constructor stub
	}
	
	public void getDriveMode()
	{
		driveStrategy.drive();
	}
}
