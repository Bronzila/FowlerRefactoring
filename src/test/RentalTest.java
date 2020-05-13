package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import classes.*;

public class RentalTest {
	
	private Rental rental;
	private Movie movie;
	
	@Before
	public void setUp() {
		movie = new Movie("Starwars", 1);
		rental = new Rental(movie, 13);
	}

	@Test
	public void getDaysRented() {
		assertEquals(13, rental.getDaysRented());
	}
	
	@Test
	public void getMovie() {
		assertEquals(movie, rental.getMovie());
	}
	
	@Test
	public void getCharge() {
		assertEquals(39.0, rental.getCharge(), 0);
	}
	
	@Test
	public void getFrequentRenterPoints() {
		assertEquals(2, rental.getFrequentRenterPoints());
	}
}