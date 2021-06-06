package inheritance;

public class Kosarkas extends Sportista{

	private double visina;

	public Kosarkas(String ime, String prezime, int godinaRodjenja, double visina) {
		super(ime, prezime, godinaRodjenja);
		this.visina = visina;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}
	
}
