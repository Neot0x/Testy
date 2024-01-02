package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformMultiplicationMinusOUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performMultiplication(4f, -9.4f);
		assertEquals(-37.6f,wynik,0.0001);
	}

}
