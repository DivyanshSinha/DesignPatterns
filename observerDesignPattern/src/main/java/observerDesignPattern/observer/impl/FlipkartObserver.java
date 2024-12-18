package observerDesignPattern.observer.impl;

import observerDesignPattern.observer.api.Observer;

public class FlipkartObserver implements Observer{

	@Override
	public void update() {
		System.out.println("Flipkart notification : iphone 15 in stock!!!");
	}

}
