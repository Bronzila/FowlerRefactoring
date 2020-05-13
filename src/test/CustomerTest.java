package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import classes.*;

public class CustomerTest {
	
	private Customer customer;

	@Before
	public void setUp() {
		customer = new Customer("Janis");
	}

	@Test
	public void getName() {
		assertEquals("Janis", customer.getName());
	}

	@Test
	public void statement() {
		String statement = "Rental Record for Janis" + "\n";
		statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";
        
		assertEquals(statement, customer.statement());
	}
}
