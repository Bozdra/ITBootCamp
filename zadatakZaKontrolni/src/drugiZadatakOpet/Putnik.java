package drugiZadatakOpet;
/*Napisati program na programskom jeziku Java koji sluzi za evidenciju vozila.
Putnik ima ime i kilazu. Tekstulani opis je ime[kilaza]
Vozilo ima naziv proizvodjaca, naziv modela i sopstvenu tezinu. Tekstualni opis je proizvodjac-model[sopstvena tezina].
Teretno vozilo je vozilo koje je natovareno teretom odredjene tezine. Moguce je dodati teret zadate tezine,
 odnosno istovariti teret zadate tezine. Tekstualni opis je proizvodjac-model[ukupna tezina]
Putnicko vozilo je vozilo u kome se nalaze putnici. Moguce je dohvatiti sve putnike koji se nalaze u vozilu, 
dodati nekog putnika i izbacini putnika sa neke pozicije. Tekstualni opis je proizvodjac-model[ukupna tezina].
Pretpostaviti da ce sve prosledjene vrednosti biti validne.*/
public class Putnik {
	
	private String ime;
	private double kilaza;
	public Putnik(String ime, double kilaza) {
		super();
		this.ime = ime;
		this.kilaza = kilaza;
	}
	public String getIme() {
		return ime;
	}
	public double getKilaza() {
		return kilaza;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime);
		sb.append("[");
		sb.append(kilaza);
		sb.append("]");
		return sb.toString();
			
	}
	
}
