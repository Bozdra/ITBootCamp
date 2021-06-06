package zadatakZaInheritance;

public class Djak extends Osoba {

	private int razred;
	private String skola;
	public Djak(String ime, String prezime, String adresa, int razred, String skola) {
		super(ime, prezime, adresa);
		this.razred = razred;
		this.skola = skola;
	
}
	public int getRazred() {
		return razred;
	}
	public void setRazred(int razred) {
		this.razred = razred;
	}
	public String getSkola() {
		return skola;
	}
	@Override
	public String toString() {
		return getIme() + "(" + skola + "-" + razred + ")";
	}
	public void setSkola(String skola) {
		this.skola = skola;
	}
}
