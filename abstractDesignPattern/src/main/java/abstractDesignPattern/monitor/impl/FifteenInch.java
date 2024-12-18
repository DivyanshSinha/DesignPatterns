package abstractDesignPattern.monitor.impl;

import abstractDesignPattern.components.api.Monitor;

public class FifteenInch implements Monitor{

	@Override
	public void build() {
		System.out.println("This is a 15 inch monitor");
	}

}
