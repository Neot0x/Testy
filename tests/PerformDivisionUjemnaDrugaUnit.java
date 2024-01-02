package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerformDivisionUjemnaDrugaUnit {

	@Test
	public void test() {
		float wynik = UnitTesting.performDivision(25.6f, -4.2f);
		assertEquals(-6.0952f,wynik,0.0001);
	}

}
