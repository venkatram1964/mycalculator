package com.venkat;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;

	@Test
	public void addTest() {
		calculator = new Calculator();
		assertEquals(4,calculator.add(2, 2) );
	}

}
