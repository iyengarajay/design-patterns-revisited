package observer_film_usual;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FilmDirector implements Subject{

	private Film film;
	
	public FilmDirector(Film film){
		this.film=film;
	}
	
	private List<FilmObserver> filmObservers = new ArrayList<>();
	
	@Override
	public void subscribe(FilmObserver filmObserver) {
		filmObservers.add(filmObserver);
		
	}

	@Override
	public void unsubsribe(FilmObserver filmObserver) {
		filmObservers.remove(filmObserver);
		
	}

	@Override
	public void makeAnnouncement() {
		for(FilmObserver filmObserver : filmObservers){
			filmObserver.notifyRelease(film);
		}
	}
	
	public void setReleaseDate(LocalDate localDate){
		film.setReleaseDate(localDate);
		makeAnnouncement();
	}
	
	

}
