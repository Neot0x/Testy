package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class PerformSubtractionUnit {
	@Test
	public void test() {
		float wynik = UnitTesting.performSubtraction(5, 2);
		assertEquals(3.0,wynik,0.0001);
	}
}
