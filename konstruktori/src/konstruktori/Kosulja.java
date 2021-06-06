package konstruktori;

public class Kosulja {
	private char model; 
	private int velicina;
	private String dezen;
	private int cena;
	
	public Kosulja(char model, int velicina, String dezen) {
		this.model = model;
		this.velicina = velicina;
		this.dezen = dezen;
	}
	
	public char getModel() {
		return model;
	}
	public int getVelicina() {
		return velicina;
	}
	public String getDezen() {
		return dezen;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
		}
}
