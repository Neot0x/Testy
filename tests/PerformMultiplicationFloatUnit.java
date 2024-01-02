package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformMultiplicationFloatUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performMultiplication(6.2f, 1.8f);
		assertEquals(11.16f,wynik,0.0001);
	}

}
