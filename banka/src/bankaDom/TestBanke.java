package bankaDom;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*proveriti da li konstruktor dobro postavlja argumente, 
 * kao i da li get metode vracaju odgovarajuce vrednosti.
 *  Kada se napravi racun, na stanju je 0 dinara.
*/
public class TestBanke {

	@Test
	public void testKonstruktora() {
	BankaKod bk = new BankaKod("Boris", "0000-5234");
	
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("Boris", bk.dohvatiIme()); //return ime sadrzi apostrofe u klasi BankaKod
	sa.assertEquals(0.00, bk.dohvatiIznos());
	sa.assertEquals("0000-5234", bk.dohvatiZiroRacun());
	sa.assertAll();
	
}
	
	@Test
	public void testIznosa() {
	BankaKod bk = new BankaKod("Boris", "0000-5234");
	Assert.assertEquals(0.00, bk.dohvatiIznos());
	}
}