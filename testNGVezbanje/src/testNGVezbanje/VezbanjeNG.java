package testNGVezbanje;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VezbanjeNG {
	
	@BeforeClass   // izvrsava se pre nego sto se pokrene prvi test posle ovoga ide na metodu, pa prvi test pa opet metoda pa drugi, pa treci
	public void preKlase() {
		System.out.println("Pocinjemo!");
	}
	@BeforeMethod // izvrsava se pre izvrsavanja svakog testa pojedinacno
	public void preMetode() {
		System.out.println("Novi test");
	}

	
	@Test //() prioritet ima manji broj u zagradi
	public void proba() {
		System.out.println("Proba 123");
	}
	
	@Test
	public void drugiTest() {
		Operacije o1 = new Operacije(2, 3 );
		int rez = o1.zbir();	
		Assert.assertEquals(rez, 5); // levo je ono sto jeste, desno je ocekivano, ovo se zove hard assert
		Assert.assertEquals(rez, -1); // sve posle pada testa se ne gleda, program iskace iz zagrade
		
	}
	
	@Test 
	public void softPrimer() {
		Operacije o1 = new Operacije(2, 3 );
		int rez = o1.zbir();	
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(rez, 5);      // soft assert, gleda se posle pada testa sledeci test, ako jedan prodje proslo je
		sa.assertEquals(rez, -1);
		sa.assertEquals(rez, 6);
		
		sa.assertAll();
	
	}
}
