package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformDivisionUjemneUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performDivision(-52.6f, -9.1f);
		assertEquals(5.7802f,wynik,0.0001);
	}

}
