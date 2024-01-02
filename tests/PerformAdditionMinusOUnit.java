package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class PerformAdditionMinusOUnit {
	@Test
	public void test() {
		float wynik = UnitTesting.performAddition(2.6f, -5f);
		assertEquals(-2.4f,wynik,0.0001);
	}
}
