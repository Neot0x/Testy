package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformSinusZeroUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performSinus(0);
		assertEquals(0,wynik,0.0001);
	}

}
