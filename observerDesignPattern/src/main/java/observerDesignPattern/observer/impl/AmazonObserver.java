package observerDesignPattern.observer.impl;

import observerDesignPattern.observer.api.Observer;

public class AmazonObserver implements Observer{
	
	@Override
	public void update() {
		System.out.println("Amazon notification : iphone 15 in stock!!!");
	}

}
