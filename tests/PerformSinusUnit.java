package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformSinusUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performSinus(2);
		assertEquals(0.9092f,wynik,0.0001);
	}

}
