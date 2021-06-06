package testNG;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {

	@Test
	public void testKruga() {
		double r = 10;
		double ocekivano = r*r*3.14;
		double realno = testNG.Calc.pKruga(r);
		
		Assert.assertEquals(ocekivano, realno);
	}
	@Test
	public void testKvadrata() {
		double a = 10;
		double ocekivano = a * a ;
		double realno = testNG.Calc.pKvadrata(a);
		Assert.assertEquals(ocekivano, realno);
	}
	@Test
	public void testPravougaonika() {
		double a = 10;
		double b = 5;
		double ocekivano = a * b;
		double realno = testNG.Calc.pPravougaonika(a,b);
		Assert.assertEquals(ocekivano, realno);
	}
	
}
