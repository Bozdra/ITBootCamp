package klaseTotale;
/*Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva koja moze da se dohvati.
*/
public class Supa extends Jelo {

	private double minutazaKuvanja;

	public Supa(String naziv, double minutazaKuvanja) {
		super(naziv, );
		this.minutazaKuvanja = minutazaKuvanja;
		// TODO Auto-generated constructor stub
	}

	public double getMinutazaKuvanja() {
		return minutazaKuvanja;
	} 
}
