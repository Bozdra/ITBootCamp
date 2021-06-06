package inheritance;

public class Teniser extends Sportista {
	private int rang;
	
	public Teniser(String ime, String prezime, int godinaRodjenja, int rang) {
		super(ime, prezime, godinaRodjenja);
		
	}


	

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}

	@Override
	public String toString() {
		return "Teniser [rang=" + rang + "Sportista=" + "]";
	}

	
}
