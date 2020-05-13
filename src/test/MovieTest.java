package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import classes.*;

public class MovieTest {

	private Movie movie;
	
	@Before
	public void setUp() {
		movie = new Movie("Starwars", 12);
	}
	
	@Test
	public void getPriceCode() {
		assertEquals(12, movie.getPriceCode());
	}
	
	@Test
	public void getTitle() {
		assertEquals("Starwars", movie.getTitle());
	}
}