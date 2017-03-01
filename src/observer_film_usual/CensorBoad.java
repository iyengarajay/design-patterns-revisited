package observer_film_usual;

public class CensorBoad implements FilmObserver {

	@Override
	public void notifyRelease(Film film) {
		System.out.println("Censor Board : Let us try for more cuts....");
	}

}
