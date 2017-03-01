package observer_film_usual;

public class Filmgoer implements FilmObserver {

	@Override
	public void notifyRelease(Film film) {
		
		String [] starCast = film.getStartCast();
		boolean hasFavouriteStar = false;
		
		
		for(String star : starCast){
			if(star.equals("Matt Damon")){
				hasFavouriteStar=true;
				break;
			}
		}
		if(film.getGenre() == Genre.ENGLISH && hasFavouriteStar){
			System.out.println("Filmgoer : Book advance tickets right away...");
		}

	}

}
