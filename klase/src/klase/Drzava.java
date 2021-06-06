package klase;

public class Drzava {

	private String ime;
	private String himna;
	private Kontinent kontinent;

	public Drzava(String ime, String himna, Kontinent kontinent) {
		this.ime = ime;
		this.himna = himna;

	}

	public String getIme() {
		return ime;
	}

	public String getHimna() {
		return himna;
	}

	public Kontinent getKontinent() {
		return kontinent;
	}

	public void setKontinent(Kontinent kontinent) {
		this.kontinent = kontinent;
	}

	public void setHimna(String himna) {
		this.himna = himna;
	}
}
