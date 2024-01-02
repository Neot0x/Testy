package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformSinusFloatUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performSinus(5.32f);
		assertEquals(-0.8210f,wynik,0.0001);
	}

}
