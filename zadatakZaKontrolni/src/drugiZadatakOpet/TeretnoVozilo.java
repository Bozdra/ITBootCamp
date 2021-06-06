package drugiZadatakOpet;
//Teretno vozilo je vozilo koje je natovareno teretom odredjene tezine. Moguce je dodati teret zadate tezine,
//odnosno istovariti teret zadate tezine. Tekstualni opis je proizvodjac-model[ukupna tezina]
public class TeretnoVozilo extends Vozilo {

	double teret;

	public TeretnoVozilo(String nazivProizvodjaca, String nazivModela, double sopstvenaTezina, double teret) {
		super(nazivProizvodjaca, nazivModela, sopstvenaTezina);
		this.teret = teret;
	}
	public void dodajTeret (double tezina) {
		teret = teret+tezina;
	}
	public void skloniTeret (double tezina) {
		teret = teret-tezina;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nazivProizvodjaca);
		sb.append("-");
		sb.append(nazivModela);
		sb.append("[");
		sb.append(sopstvenaTezina+teret);
		sb.append("]");
		return sb.toString();
	}
}
