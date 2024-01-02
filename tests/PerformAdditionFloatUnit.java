package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformAdditionFloatUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performAddition(2.5f, 5.6f);
		assertEquals(8.1f,wynik,0.0001);
	}

}
