package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformRootFloatUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performRoot(5.4f);
		assertEquals(2.3237f,wynik,0.0001);
	}

}
