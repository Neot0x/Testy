package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformDivisionZeroUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performDivision(10, 0);
		assertEquals(0,wynik,0.0001);
	}

}
