package observerDesignPattern.observable.impl;

import java.util.HashSet;
import java.util.Set;

import observerDesignPattern.observable.api.Observable;
import observerDesignPattern.observer.api.Observer;

public class Iphone15Observable implements Observable{
	
	private Set<Observer> observers;
	
	private int stockCount;
	
	public Iphone15Observable()
	{
		this.stockCount=0;
		this.observers = new HashSet<>();
	}

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		if(observers.contains(observer))
			observers.remove(observer);
	}

	@Override
	public void notiffy() {
		observers.stream().forEach(t -> t.update());
	}
	
	public int getStockCount()
	{
		return this.stockCount;
	}
	
	public void updateStockCount(int updatedStock)
	{
		if(this.stockCount==0 && updatedStock>0)
			this.notiffy();
		this.stockCount = updatedStock;
	}
}
