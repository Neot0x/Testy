package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class PerformSubtractionFloatUnit {
	@Test
	public void test() {
		float wynik = UnitTesting.performSubtraction(7.2f, 9.53f);
		assertEquals(-2.33f,wynik,0.0001);
	}
}
