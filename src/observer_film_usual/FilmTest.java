package observer_film_usual;

import java.time.LocalDate;

public class FilmTest {
	public static void main(String[] args) {
		
		Film film = new  Film("The Martian",Genre.ENGLISH);
		String []starCast = {"Matt Damon", "Kate Mara"};
		film.setStartCast(starCast);
		
		FilmDirector filmDirector = new FilmDirector(film);
		
		FilmObserver censorBoard = new CensorBoad();
		FilmObserver movieCritic = new FilmCritic();
		FilmObserver cinemaHall = new MultiplexCinemaHall();
		
	
		
		filmDirector.subscribe(censorBoard);
		filmDirector.subscribe(movieCritic);
		filmDirector.subscribe(cinemaHall);
		
		//Add new subscriber.
		
		film.setGenre(Genre.ENGLISH);
		filmDirector.setReleaseDate(LocalDate.now());
		
		//Unsubscribe censor board :-)
		filmDirector.unsubsribe(censorBoard);
		film.setGenre(Genre.TAMIL);
		filmDirector.setReleaseDate(LocalDate.now());
		
	}

}
