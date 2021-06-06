package drugiZadatak;

import java.util.List;

public class PutnickoVozilo extends Vozilo {
//Putnicko vozilo je vozilo u kome se nalaze putnici. Moguce je dohvatiti sve putnike koji se nalaze u vozilu, 
//dodati nekog putnika i izbacini putnika sa neke pozicije. 
//Tekstualni opis je proizvodjac-model[ukupna tezina].
	
	private List<Putnik> putnici;
	
	public PutnickoVozilo(String nazivProizvodjaca, String nazivModela, double tezina, List<Putnik> putnici) {
		super(nazivProizvodjaca, nazivModela, tezina);
		this.putnici = putnici;
	}
	public List<Putnik> getPutnici() {
		return putnici;
	}

	public void dodajPutnika(Putnik p) {
		this.putnici.add(p);
	}
	public void izbaciPutnika(int pozicija) {
		putnici.remove(pozicija);
	}
	
	
	

	
	@Override
	public String toString() {
		double ukupnaKilaza = 0;
		
		for (int i = 0; i < putnici.size(); i++) {
			ukupnaKilaza = ukupnaKilaza+putnici.get(i).getKilaza();
		}	
		
		double ukupno = ukupnaKilaza+getTezina();
		StringBuilder sb = new StringBuilder();
		sb.append(getNazivProizvodjaca());
		sb.append("-");
		sb.append(getNazivModela());
		sb.append("[");
		sb.append(ukupno);
		sb.append("]");
		return sb.toString();
		
	
}
}
