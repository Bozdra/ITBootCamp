package klase_2_2;

public class Zaposleni {
	
	private String ime;
	private String prezime;
	private String pozicija;
	private double primanja;
	public Zaposleni(String ime, String prezime, String pozicija, double primanja) {
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.primanja = primanja;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public double getPrimanja() {
		return primanja;
	}
	public void setPrimanja(double primanja) {
		this.primanja = primanja;
	}

}
