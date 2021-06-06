package banka;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
/*Проверити да ли set-ери добро постављају одговарајуће вредности, као и да 
 * ли get-ери враћају одговарајуће вредности.
Проверити да ли је исправан формат исписа једног Account-a. Очекивани формат исписа:
broj<tab>ime<tab>stanje . Стање треба да буде заокружено на две децимале.
Направити 100.000 налога помоћу конструктора  public Account(String name) и
 проверити да ли се сви бројеви разликују.
*/
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAccount {

	@Test
	public void testKonstruktor() {
		Account ac = new Account("Boris", "123456-789");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ac.getName(), "Boris");
		sa.assertEquals(ac.getNumber(), "123456-789");
		sa.assertEquals(ac.getAmount(), 0.00);
		
		sa.assertAll();
	}
	@Test 
	public void testSeteraIGetera() {
		Account ac = new Account("Boris","123456-789");
		
		ac.setAmount(500.0);
		
		
		Assert.assertEquals(ac.getAmount(), 500.00);
		
	}
	@Test
	public void testIspisa() {
		Account ac = new Account("Boris","123456-789");
		String ocekivani = String.format("%s\t%s\t%.2f", ac.getNumber(), ac.getName(),ac.getAmount());
		//String a = ac.toString();
		
		Assert.assertEquals(ac.toString(), ocekivani);

	}
	@Test
	public void testNaloga() {
		//for (int i = 0; i<=50000;i++) {
			int max = 50;
			Account[] racuni = new Account[max];
			for (int i = 0; i<max; i++) {
				racuni[i] = new Account ("Boris" + i);
			}
			for (int i = 0; i<max; i++) {
				for (int j = 0; j<i; j++) {
				Assert.assertNotEquals(racuni[i].getNumber(), racuni[j].getNumber());
			}
		}
	}
}
