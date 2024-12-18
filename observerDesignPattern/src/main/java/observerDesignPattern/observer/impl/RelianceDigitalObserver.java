package observerDesignPattern.observer.impl;

import observerDesignPattern.observer.api.Observer;

public class RelianceDigitalObserver implements Observer{

	@Override
	public void update() {
		System.out.println("RelianceDigital notification : iphone 15 in stock!!!");
	}

}
