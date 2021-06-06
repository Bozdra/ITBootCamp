package klaseTotale;
/*Sastojak sadrzi naziv i cenu po kilogramu. Svi podaci mogu da se dohvate.
Omoguciti da cena moze i da se promeni, ali da nikada nece biti negativna.
*/
public class Sastojak {
	
	private String naziv;
	private double cenaKg;
	private double kolicina;
	
	public Sastojak(String naziv, double cenaKg) {
		super();
		this.naziv = naziv;
		this.cenaKg = cenaKg;
	}
	
	public Sastojak(String naziv, double cenaKg, double kolicina) {
		super();
		this.naziv = naziv;
		this.cenaKg = cenaKg;
		this.kolicina = kolicina;
	}
	
	public double getCenaKg() {
		return cenaKg;
	}
	
	public void setCenaKg(double cenaKg) {
		if (cenaKg > 0) {
			this.cenaKg = cenaKg;
		} else {
			System.out.println("Cena ne moze biti negativna");
		}
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public double getKolicina() {
		return kolicina;
	}
	
	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}
}
