package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformMultiplicationUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performMultiplication(5, 2);
		assertEquals(10.0,wynik,0.0001);
	}

}
