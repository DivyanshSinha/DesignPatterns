package startegyDesignPattern.strategy.impl;

import startegyDesignPattern.strategy.api.DriveStrategy;

public class OffroadDrive implements DriveStrategy{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Offroad Drive");
	}

}
