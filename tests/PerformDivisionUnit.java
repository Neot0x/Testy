package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformDivisionUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performDivision(10, 2);
		assertEquals(5,wynik,0.0001);
	}

}
