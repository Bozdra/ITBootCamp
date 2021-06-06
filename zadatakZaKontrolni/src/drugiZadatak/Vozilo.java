package drugiZadatak;
//Vozilo ima naziv proizvodjaca, naziv modela i sopstvenu tezinu. Tekstualni opis je proizvodjac-model[sopstvena tezina].

public class Vozilo {
	StringBuilder sb = new StringBuilder();
	protected String nazivProizvodjaca;
	protected String nazivModela;
	protected double tezina;
	
	
	public String getNazivProizvodjaca() {
		return nazivProizvodjaca;
	}
	public void setNazivProizvodjaca(String nazivProizvodjaca) {
		this.nazivProizvodjaca = nazivProizvodjaca;
	}
	public String getNazivModela() {
		return nazivModela;
	}
	public void setNazivModela(String nazivModela) {
		this.nazivModela = nazivModela;
	}
	public double getTezina() {
		return tezina;
	}
	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
	public Vozilo(String nazivProizvodjaca, String nazivModela, double tezina) {
		super();
		this.nazivProizvodjaca = nazivProizvodjaca;
		this.nazivModela = nazivModela;
		this.tezina = tezina;
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
