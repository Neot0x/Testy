package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformPowerMinusWUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performPower(3, -2);
		assertEquals(0.1111f,wynik,0.0001);
	}

}
