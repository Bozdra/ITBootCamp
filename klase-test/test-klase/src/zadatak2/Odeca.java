package zadatak2;
//Odeca je stvar koja ima dezen. Tekstualni opis je naziv - velicina/dezen ? cena.
public class Odeca extends Stvar {

	private String dezen;

	public Odeca(double cena, String naziv, double velicina, char oznaka, String dezen) {
		super(cena, naziv, velicina, oznaka);
		this.dezen = dezen;
	}

	public String getDezen() {
		return dezen;
	}

	public void setDezen(String dezen) {
		this.dezen = dezen;
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
			sb.append(getDezen());
			sb.append(" ");
			sb.append("-");
			sb.append(" ");
			sb.append(getCena());
			return sb.toString();
	}
	}

