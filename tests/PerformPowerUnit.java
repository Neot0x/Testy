package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformPowerUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performPower(4, 2);
		assertEquals(16.0,wynik,0.0001);
	}

}
