package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformDivisionFloatUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performDivision(34.23f, 1.2f);
		assertEquals(28.525f,wynik,0.0001);
	}

}
