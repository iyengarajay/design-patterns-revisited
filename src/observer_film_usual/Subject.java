package observer_film_usual;

public interface Subject {
	
	public void subscribe(FilmObserver filmObserver);
	
	public void unsubsribe(FilmObserver filmObserver);
	
	public void makeAnnouncement();

}
