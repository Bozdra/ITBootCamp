package drugiZadatakOpet;

import java.util.List;

/*Putnicko vozilo je vozilo u kome se nalaze putnici. Moguce je dohvatiti sve putnike koji se nalaze u vozilu, 
dodati nekog putnika i izbacini putnika sa neke pozicije. Tekstualni opis je proizvodjac-model[ukupna tezina].*/
public class PutnickoVozilo extends Vozilo {

	private List <Putnik> putnici;

	public PutnickoVozilo(String nazivProizvodjaca, String nazivModela, double sopstvenaTezina, List<Putnik> putnici) {
		super(nazivProizvodjaca, nazivModela, sopstvenaTezina);
		this.putnici = putnici;
	}

	public List<Putnik> getPutnici() {
		return putnici;
	}
	public void dodajPutnika (Putnik p) {
		this.putnici.add(p);
	}
	public void skloniPutnika (int pozicija) {
		putnici.remove(pozicija);
	}
	public String toString() {
		double utp =  0;
		for (int i = 0; i<putnici.size();i++) {
			utp = utp + putnici.get(i).getKilaza();
		}
		StringBuilder sb = new StringBuilder();
		sb.append(nazivProizvodjaca);
		sb.append("-");
		sb.append(nazivModela);
		sb.append("[");
		sb.append(sopstvenaTezina+utp);
		sb.append("]");
		return sb.toString();
}
}