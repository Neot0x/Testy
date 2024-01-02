package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformAdditionUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performAddition(2, 5);
		assertEquals(7.0,wynik,0.0001);
	}
	
}