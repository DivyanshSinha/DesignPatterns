package startegyDesignPattern.test;

import startegyDesignPattern.vehicle.NormalVehicle;
import startegyDesignPattern.vehicle.OffroadVehicle;
import startegyDesignPattern.vehicle.SportsVehicle;

public class Test {

	public static void main(String[] args) {
		
		NormalVehicle car1 = new NormalVehicle();
		car1.getDriveMode();
		
		OffroadVehicle car2 = new OffroadVehicle();
		car2.getDriveMode();
		
		SportsVehicle car3 = new SportsVehicle();
		car3.getDriveMode();
	}

}
