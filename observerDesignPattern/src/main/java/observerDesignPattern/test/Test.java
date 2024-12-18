package observerDesignPattern.test;

import observerDesignPattern.observable.impl.Iphone15Observable;
import observerDesignPattern.observer.impl.AmazonObserver;
import observerDesignPattern.observer.impl.FlipkartObserver;
import observerDesignPattern.observer.impl.RelianceDigitalObserver;

public class Test {

	public static void main(String[] args) {
		Iphone15Observable iphone15Observable = new Iphone15Observable();
		
		iphone15Observable.subscribe(new AmazonObserver());
		iphone15Observable.subscribe(new FlipkartObserver());
		iphone15Observable.subscribe(new RelianceDigitalObserver());
		
		System.out.println(iphone15Observable.getStockCount());
		
		iphone15Observable.updateStockCount(90);
		System.out.println("***********************************************");
		iphone15Observable.updateStockCount(0);
		iphone15Observable.updateStockCount(100);
	}

}
