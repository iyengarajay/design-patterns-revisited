package observer_film_refactored;

public interface Subject {
	
	public void subscribe(FilmObserver filmObserver);
	
	public void unsubsribe(FilmObserver filmObserver);
	
	public void makeAnnouncement();

}
