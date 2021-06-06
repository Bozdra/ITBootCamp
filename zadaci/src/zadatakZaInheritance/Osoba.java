package zadatakZaInheritance;

public class Osoba {
	
	private String ime;
	private String prezime;
	private String Adresa;
	public Osoba(String ime, String prezime, String adresa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		Adresa = adresa;
	}
	@Override
	public String toString() {
		return ime +" "+ prezime+" " + "(" + Adresa + ")";
				
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
	public String getAdresa() {
		return Adresa;
	}
	public void setAdresa(String adresa) {
		Adresa = adresa;
	}
	
	
}
