package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class PerformAdditionMinusDUnit {
	@Test
	public void test() {
		float wynik = UnitTesting.performAddition(-2f, -5f);
		assertEquals(-7f,wynik,0.0001);
	}
}
