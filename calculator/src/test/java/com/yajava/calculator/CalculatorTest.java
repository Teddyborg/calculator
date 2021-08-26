package com.yajava.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calulator tests")
public class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	
	@Test
    void addition() {
        assertEquals(4.0d, calculator.add(1.0d, 3.0d));
    }

	@Test
    void subtraction() {
        assertEquals(-2.0d, calculator.subtract(1.0d, 3.0d));
    }

	@Test
    void multiplication() {
        assertEquals(30.0d, calculator.multiply(10.0d, 3.0d));
    }

	@Test
    void division() {
        assertEquals(3.0d, calculator.divide(30.0d, 10.0d));
    }

	@Test
    void factorial() {
		try {
	        assertEquals(5040, calculator.factorial(7));			
		} catch (Exception e) {
			
		}
    }

	@Test
    void factorialException() {
		assertThrows(ToLargeFactorialException.class, () -> calculator.factorial(15));
    }

}
