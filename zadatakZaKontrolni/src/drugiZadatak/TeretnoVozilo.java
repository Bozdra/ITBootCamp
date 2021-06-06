package drugiZadatak;
//Teretno vozilo je vozilo koje je natovareno teretom odredjene tezine. Moguce je dodati teret zadate tezine, 
//odnosno istovariti teret zadate tezine. Tekstualni opis je proizvodjac-model[ukupna tezina]
public class TeretnoVozilo extends Vozilo {
	
	private double teret;

	public TeretnoVozilo(String nazivProizvodjaca, String nazivModela, double tezina) {
		super(nazivProizvodjaca, nazivModela, tezina);
		
	}

	public double getTeret() {
		return teret;
	}

	public void setTeret(double teret) {
		this.teret = teret;
	}

	@Override
	public String toString() {
		sb.append(nazivProizvodjaca);
		sb.append("-");
		sb.append(nazivModela);
		sb.append("[");
		sb.append(tezina);
		sb.append("]");
		String a = sb.toString();
		return a;
	}
	
}
