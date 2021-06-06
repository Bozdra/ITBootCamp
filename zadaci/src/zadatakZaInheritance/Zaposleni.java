package zadatakZaInheritance;

public class Zaposleni extends Osoba {

	private String firma;
	private String odeljenje;
	public Zaposleni(String ime, String prezime, String adresa, String firma, String odeljenje) {
		super(ime, prezime, adresa);
		this.firma = firma;
		this.odeljenje = odeljenje;
	}
	public String getFirma() {
		return firma;
	}
	@Override
	public String toString() {
		 return getIme() + "(" + firma + "-" + odeljenje + ")";
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	public String getOdeljenje() {
		return odeljenje;
	}
	public void setOdeljenje(String odeljenje) {
		this.odeljenje = odeljenje;
	}
}
