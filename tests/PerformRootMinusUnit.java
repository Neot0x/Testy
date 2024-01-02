package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformRootMinusUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performRoot(-3);
		assertEquals(0,wynik,0.0001);
	}

}
