package classes;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie newmovie, int newdaysRented) {
		movie = newmovie;
		daysRented = newdaysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getFrequentRenterPoints() {
		if ((movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else
			return 1;
	}

	public double getCharge() {
		return movie._price.getCharge(daysRented);
	}
}