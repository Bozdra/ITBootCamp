package zadatak2;
//Obuca je stvar koja ima materijal. Tekstualni opis je naziv – velicina/materijal - cena.
public class Obuca extends Stvar{

	private String materijal;

	public Obuca(double cena, String naziv, double velicina, char oznaka, String materijal) {
		super(cena, naziv, velicina, oznaka);
		this.materijal = materijal;
	}

	public String getMaterijal() {
		return materijal;
	}

	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNaziv());
		sb.append(" ");
		sb.append("-");
		sb.append(" ");
		sb.append(getVelicina());
		sb.append("/");
		sb.append(getMaterijal());
		sb.append(" ");
		sb.append("-");
		sb.append(" ");
		sb.append(getCena());
		return sb.toString();
}
}
