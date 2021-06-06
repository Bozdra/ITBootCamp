package knjizara;

public class Knjiga {

	private String naslov;
	private Autor autor;
	private int brojProdatihPrimeraka;
	private int cena;

	public Knjiga(String naslov, Autor autor) {
		this.naslov = naslov;
		this.autor = autor;
	}

	public Autor getAutor() {
		return autor;
	}

	public String getNaslov() {
		return naslov;
	}

	public int getBrojProdatihPrimeraka() {
		return brojProdatihPrimeraka;
	}

	public void setBrojProdatihPrimeraka() {
		this.brojProdatihPrimeraka = brojProdatihPrimeraka;
	}

	public void setAutor() {
		this.autor = autor;
	}

	public void setNaslov() {
		this.naslov = naslov;
	}

}
