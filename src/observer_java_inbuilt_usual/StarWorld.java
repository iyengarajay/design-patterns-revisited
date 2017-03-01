package observer_java_inbuilt_usual;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StarWorld extends Observable {

	private Episode episode;

	private List<Observer> observers = new ArrayList<>();

	@Override
	public synchronized void addObserver(Observer arg0) {

		observers.add(arg0);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this, episode);
		}
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		observers.remove(o);
	}

	public void setEpisode(Episode ep) {
		this.episode = ep;
		setChanged();
		notifyObservers();
	}

}
