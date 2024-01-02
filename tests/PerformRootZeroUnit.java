package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformRootZeroUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performRoot(0);
		assertEquals(0,wynik,0.0001);
	}

}
