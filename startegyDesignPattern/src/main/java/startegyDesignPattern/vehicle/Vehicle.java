package startegyDesignPattern.vehicle;

import startegyDesignPattern.strategy.api.DriveStrategy;

public class Vehicle {
	
	DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy=driveStrategy;
	}
	
}
