package klase;

public class Grad {
	// Napisati klasu Grad koja sadrzi podatke o imenu, nadmorskoj visini, broju
	// stanovnika i drzavi u kojoj se nalazi
	// . Napisati klasu Drzava koja sadrzi podatke o imenu i himni, kao i o tome na
	// kom kontinentu se nalazi.
	// Napisati klasu Kontinent koja sadrzi podatke o nazivu kontinenta i
	// dominantnoj rasi na njemu. U glavnom programu se igrati sa ovim klasama.
	private String ime;
	private int nadmorskaVisina;
	private int brojStanovnika;
	private Drzava drzava;

	public Grad(String ime, int nadmorskaVisina, int brojStanovnika, Drzava drzava) {
		this.ime = ime;
		this.nadmorskaVisina = nadmorskaVisina;
		this.brojStanovnika = brojStanovnika;

	}

	public String getIme() {
		return ime;
	}

	public int getNadmorskaVisina() {
		return nadmorskaVisina;
	}

	public int getBrojStanovnika() {
		return brojStanovnika;
	}

	public Drzava getDrzava() {
		return drzava;
	}

	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}

}
