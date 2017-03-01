package observer_film_refactored;

public class FilmObservers {

	public static void notifyCritic(Film film) {
		
		System.out.println("Film Critic - Ask for free passes");
		System.out.println("Start preparing review before watching film...");
	}

	public static void notifyCinemaMultiplexHalls(Film film) {

		// Depending on the release date and genre, do things...

		if (film.getGenre() == Genre.TAMIL) {
			System.out.println("Cinema Hall - Arrange for just 1 show every day !");
		} else {
			System.out.println("Cinema Hall - Arrange for multiple shows every day !");
		}

	}

	public static void notifyCensorBoard(Film film) {
		System.out.println("Censor Board : Let us try for more cuts....");
	}

}
