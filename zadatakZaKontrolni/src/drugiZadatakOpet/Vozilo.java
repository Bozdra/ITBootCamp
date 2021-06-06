package drugiZadatakOpet;
//Vozilo ima naziv proizvodjaca, naziv modela i sopstvenu tezinu. Tekstualni opis je proizvodjac-model[sopstvena tezina].
public class Vozilo {

	String nazivProizvodjaca;
	String nazivModela;
	double sopstvenaTezina;
	public Vozilo(String nazivProizvodjaca, String nazivModela, double sopstvenaTezina) {
		super();
		this.nazivProizvodjaca = nazivProizvodjaca;
		this.nazivModela = nazivModela;
		this.sopstvenaTezina = sopstvenaTezina;
	}
	public String getNazivProizvodjaca() {
		return nazivProizvodjaca;
	}
	public String getNazivModela() {
		return nazivModela;
	}
	public double getSopstvenaTezina() {
		return sopstvenaTezina;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nazivProizvodjaca);
		sb.append("-");
		sb.append(nazivModela);
		sb.append("[");
		sb.append(sopstvenaTezina);
		sb.append("]");
		return sb.toString();
	}
}
