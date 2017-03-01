package observer_film_refactored;

import java.time.LocalDate;

public class FilmTestVersion1 {
	public static void main(String[] args) {
		
		Film film = new  Film("The Martian",Genre.ENGLISH);
		String []starCast = {"Matt Damon", "Kate Mara"};
		film.setStartCast(starCast);
		
		FilmDirector filmDirector = new FilmDirector(film);
		
		FilmObserver censorBoard = (Film filmParam) ->System.out.println("Censor Board : Let us try for more cuts....");
		
		FilmObserver movieCritic = (Film filmParam) -> {
															System.out.println("Film Critic - Ask for free passes");
															System.out.println("Start preparing review before watching film...");
													   };
		
		
		FilmObserver cinemaHall = (Film filmParam) -> {
			if (filmParam.getGenre() == Genre.TAMIL) {
				System.out.println("Cinema Hall - Arrange for just 1 show every day !");
			} else {
				System.out.println("Cinema Hall - Arrange for multiple shows every day !");
			}
		};
		
	
		
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
