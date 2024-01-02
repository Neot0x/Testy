package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformPowerMinusUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performPower(-3, 2);
		assertEquals(9.0,wynik,0.0001);
	}

}
