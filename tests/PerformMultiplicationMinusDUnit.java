package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformMultiplicationMinusDUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performMultiplication(-5.3f, -7.5f);
		assertEquals(39.75f,wynik,0.0001);
	}

}
