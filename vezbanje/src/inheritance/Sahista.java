package inheritance;

public class Sahista extends Sportista {
	
	private String titula;
	
	public Sahista(String ime, String prezime, int godinaRodjenja, String titula) {
		super(ime, prezime, godinaRodjenja);
		this.titula = titula;
	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

	
}
