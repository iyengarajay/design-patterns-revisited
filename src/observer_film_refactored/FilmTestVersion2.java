package observer_film_refactored;

import java.time.LocalDate;

public class FilmTestVersion2 {
	
	public static void main(String[] args) {

		Film film = new Film("The Martian", Genre.ENGLISH);
		String[] starCast = { "Matt Damon", "Kate Mara" };
		film.setStartCast(starCast);

		FilmDirector filmDirector = new FilmDirector(film);

		FilmObserver censorBoard = FilmObservers::notifyCensorBoard;

		FilmObserver movieCritic = FilmObservers::notifyCritic;

		FilmObserver cinemaHall = FilmObservers::notifyCinemaMultiplexHalls;

		filmDirector.subscribe(censorBoard);
		filmDirector.subscribe(movieCritic);
		filmDirector.subscribe(cinemaHall);

		// Add new subscriber.

		film.setGenre(Genre.ENGLISH);
		filmDirector.setReleaseDate(LocalDate.now());

		// Unsubscribe censor board :-)
		filmDirector.unsubsribe(censorBoard);
		film.setGenre(Genre.TAMIL);
		filmDirector.setReleaseDate(LocalDate.now());

	}

}
