package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void calTest() {
		
		Calculator cal = new Calculator();
		
		assertEquals(cal.add(7, 3) , 10);
		
		
	}
	
	@Test
	public void isPrimeTest() {
		Calculator cal = new Calculator();
		
		assertFalse(cal.isPrime(-1));
		assertTrue(cal.isPrime(13));
		
		assertFalse(cal.isPrime(14));
	}
}
