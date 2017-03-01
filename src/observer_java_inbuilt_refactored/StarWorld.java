package observer_java_inbuilt_refactored;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StarWorld extends Observable {

	private Episode episode;

	private List<Observer> observers = new ArrayList<>();

	//The original addObserver does not return a reference, hence the registerObserver.
	public synchronized Observer registerObserver(Observer observer) {
		observers.add(observer);
		return observer;
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this, episode);
		}
	}

	@Override
	public synchronized void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void setEpisode(Episode ep) {
		this.episode = ep;
		notifyObservers();
	}

}
