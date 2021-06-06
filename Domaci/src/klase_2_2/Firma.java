package klase_2_2;

public class Firma {

	private String ime;
	private String sediste;
	private int pib;
	private Zaposleni [] zaposleni;
	public Firma(String ime, String sediste, int pib, Zaposleni[] zaposleni) {
		
		this.ime = ime;
		this.sediste = sediste;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}
	public String getImeFirme() {
		return ime;
	}
	public void setImeFirme(String ime) {
		this.ime = ime;
	}
	public String getSediste() {
		return sediste;
	}

	public int getPib() {
		return pib;
	}

	public Zaposleni[] getZaposleni() {
		return zaposleni;
	}
	
	
}
