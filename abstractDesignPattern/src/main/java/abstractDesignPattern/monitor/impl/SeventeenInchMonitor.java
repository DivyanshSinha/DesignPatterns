package abstractDesignPattern.monitor.impl;

import abstractDesignPattern.components.api.Monitor;

public class SeventeenInchMonitor implements Monitor{

	@Override
	public void build() {
		System.out.println("This is a seventeen inch monitor");
	}

}
