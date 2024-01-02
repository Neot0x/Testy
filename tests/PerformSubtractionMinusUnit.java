package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class PerformSubtractionMinusUnit {
	@Test
	public void test() {
		float wynik = UnitTesting.performSubtraction(4.67f, -2.9f);
		assertEquals(7.57f,wynik,0.0001);
	}
}
