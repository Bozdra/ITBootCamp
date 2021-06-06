package klase;

public class Vakcine {
//Napraviti Klasu vakcina koja sadrzi podatke o nazivu i zemlji porekla. Uvrstiti je umesto stringa koji predstavlja vakcinu.

	private String ime;
	private String zemljaPorekla;
	public Vakcine(String ime, String zemljaPorekla) {
		super();
		this.ime = ime;
		this.zemljaPorekla = zemljaPorekla;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getZemljaPorekla() {
		return zemljaPorekla;
	}
	public void setZemljaPorekla(String zemljaPorekla) {
		this.zemljaPorekla = zemljaPorekla;
	}
}
