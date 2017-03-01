package observer_film_usual;

import java.time.LocalDate;

public class Film {

	private String name;

	private String[] startCast;

	private LocalDate releaseDate;

	private boolean isApproved;

	private Genre genre;

	public Film(String name, Genre genre) {

		this.name = name;
		this.genre = genre;

	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getStartCast() {
		return startCast;
	}

	public void setStartCast(String[] startCast) {
		this.startCast = startCast;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

}
