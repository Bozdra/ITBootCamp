package klase_3;

import java.util.List;

public class Putovanje {
	
	private String destinacija;
	private double cena;
	private List<Putnik> putnik;
	public Putovanje(String destinacija, double cena, List<Putnik> putnik) {
		super();
		this.destinacija = destinacija;
		this.cena = cena;
		this.putnik = putnik;
	}
	public String getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public List<Putnik> getPutnik() {
		return putnik;
	}
	public void setPutnik(List<Putnik> putnik) {
		this.putnik = putnik;
	}

}
