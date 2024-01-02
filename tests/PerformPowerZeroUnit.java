package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformPowerZeroUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performPower(43, 0);
		assertEquals(1.0,wynik,0.0001);
	}

}
