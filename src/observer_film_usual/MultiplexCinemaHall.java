package observer_film_usual;

public class MultiplexCinemaHall implements FilmObserver {

	@Override
	public void notifyRelease(Film film) {
		
		//Depending on the release date and genre, do things...

		if (film.getGenre() == Genre.TAMIL) {
			System.out.println("Cinema Hall - Arrange for just 1 show every day !");
		} else {
			System.out.println("Cinema Hall - Arrange for multiple shows every day !");
		}

	}

}
