package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PerformAdditionUnit.class, PerformAdditionFloatUnit.class, PerformAdditionMinusDUnit.class, PerformAdditionMinusOUnit.class,
				PerformSubtractionUnit.class, PerformSubtractionFloatUnit.class, PerformSubtractionMinusUnit.class,
				PerformMultiplicationUnit.class, PerformMultiplicationFloatUnit.class, PerformMultiplicationMinusOUnit.class, PerformMultiplicationMinusDUnit.class,
				PerformDivisionUnit.class, PerformDivisionFloatUnit.class, PerformDivisionUjemnaPierwszaUnit.class, PerformDivisionUjemnaDrugaUnit.class, PerformDivisionUjemneUnit.class, PerformDivisionZeroUnit.class,
				PerformPowerUnit.class, PerformPowerFloatUnit.class, PerformPowerMinusUnit.class, PerformPowerMinusWUnit.class, PerformPowerZeroUnit.class,
				PerformRootUnit.class, PerformRootFloatUnit.class, PerformRootZeroUnit.class, PerformRootMinusUnit.class,
				PerformSinusUnit.class, PerformSinusFloatUnit.class, PerformSinusZeroUnit.class, PerformSinusMinusUnit.class})
public class AllTests {

}
