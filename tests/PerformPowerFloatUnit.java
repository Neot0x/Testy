package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformPowerFloatUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performPower(1.2f, 3.4f);
		assertEquals(1.8587f,wynik,0.0001);
	}

}
