package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformRootUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performRoot(4);
		assertEquals(2.0,wynik,0.0001);
	}

}
