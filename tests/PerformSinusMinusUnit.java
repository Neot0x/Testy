package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformSinusMinusUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performSinus(-0.4f);
		assertEquals(-0.3894f,wynik,0.0001);
	}

}
