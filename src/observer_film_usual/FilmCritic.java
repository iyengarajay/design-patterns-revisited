package observer_film_usual;

public class FilmCritic implements FilmObserver {

	@Override
	public void notifyRelease(Film film) {
		System.out.println("Film Critic - Ask for free passes");
		System.out.println("Start preparing review before watching film...");
	}

}
