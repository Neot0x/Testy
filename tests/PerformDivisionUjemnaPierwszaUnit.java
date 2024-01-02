package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformDivisionUjemnaPierwszaUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performDivision(-5.6f, 2);
		assertEquals(-2.8f,wynik,0.0001);
	}

}
