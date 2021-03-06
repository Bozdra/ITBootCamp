package zadatak2;
//Stvar  ima cenu, naziv, velicinu i oznaku za kolekciju (m ? muska, z ? zenska, u - unisex). Tekstulani opis je naziv ? cena.
public class Stvar {

	private double cena;
	private String naziv;
	private double velicina;
	private char oznaka;
	public Stvar(double cena, String naziv, double velicina, char oznaka) {
		super();
		this.cena = cena;
		this.naziv = naziv;
		this.velicina = velicina;
		this.oznaka = oznaka;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getVelicina() {
		return velicina;
	}
	public void setVelicina(double velicina) {
		this.velicina = velicina;
	}
	public char getOznaka() {
		return oznaka;
	}
	public void setOznaka(char oznaka) {
		this.oznaka = oznaka;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv);
		sb.append(" - ");
		sb.append(cena);
		return sb.toString();
	}
}
