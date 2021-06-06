package banka;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/* Потребно је направити тест за исправност класе Bank. 
За све тестове потребно је направити јединствену банку која се на почетку теста ресетује.
Сматрати да ова банка не може да има налог код којег је стање негативно. 
Ако се на основу тестова пронађе нека грешка у коду потребно је да се поправи оригинални код.
Потребно је испитати да ли адекватно ради отварање налога, 
тако што ће се убацити 5 налога и затим испитати да ли се ти налози могу дохватити.
Проверити да ли добро ради метода за уплату новца.
Проверити да ли добро ради метода за трансфер новца.
Проверити да ли добро ради метода за рачунање укупног новца у банци (getSumMoney).

*/
public class TestiranjeBanke {
	
	private Banka b;
	
		@BeforeClass 
		public void initBank() {  // pravi jedinstvenu banku svaki put
			b = new Banka();
		}
		
		@BeforeMethod //BeforeClass
		public void resetBanke() { // resetuje banku svaki put na 0
			b.reset(); //Bank.reset
		}
		
		@Test
		public void testOtvaranjeNaloga() {
		int max = 5;
		
			for (int i = 1; i <= max; i++) {
			Account ac = b.openAccount("Boris");
			Assert.assertEquals(b.getAccount(ac.getNumber()), ac); // ne znam zasto ne radi
		}
	}
		@Test 
		public void testUplate() {
			
			Account ac = b.openAccount("Boris");
			b.payInMoney(ac.getNumber(), 500.00);
			Assert.assertEquals(ac.getAmount(), 500.00);
		}
		@Test
		public void testTransfera() {
			Account ac = b.openAccount("Boris");
			Account bc = b.openAccount("Rizbo");
			b.payInMoney(ac.getNumber(), 500.00);
			b.transferMoney(ac.getNumber(), bc.getNumber(), 300.00);
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(bc.getAmount(), 300.00); // treba da testiras i prvi account da li se smanjila vrednost
			sa.assertEquals(ac.getAmount(), 200.00);
		}
		@Test
		public void testSume() {
			Account ac = b.openAccount("Boris");
			Account bc = b.openAccount("Rizbo");
			b.payInMoney(ac.getNumber(), 500.00);
			b.payInMoney(bc.getNumber(), 500.00);
			Assert.assertEquals(b.getSumMoney(b), 1000.00);
			Double ba = ac.getAmount();
			System.out.println(ba);
		}
	}


