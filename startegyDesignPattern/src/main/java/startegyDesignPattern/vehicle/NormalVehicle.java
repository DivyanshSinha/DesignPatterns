package startegyDesignPattern.vehicle;

import startegyDesignPattern.strategy.impl.NormalDrive;

public class NormalVehicle extends Vehicle{

	public NormalVehicle() {
		super(new NormalDrive());
	}
	
	public void getDriveMode()
	{
		driveStrategy.drive();
	}
}
