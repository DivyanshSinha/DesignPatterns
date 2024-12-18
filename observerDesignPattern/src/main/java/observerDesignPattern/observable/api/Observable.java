package observerDesignPattern.observable.api;

import observerDesignPattern.observer.api.Observer;

public interface Observable {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void notiffy();
}
