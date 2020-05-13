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
		movie = new Movie("Starwars", 12);
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
}