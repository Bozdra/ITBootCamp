package klase_3;
/*Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika.

 *  Putnici imaju ime, prezime i broj pasosa.
U glavnom programu se igrati i testirati napisane klase.
Obavezni deo: napraviti bar 3 razlicita putovanja. Po zelji staviti putovanja u 
listu koja se zove ponuda. Jednom putovanju bar promeniti cenu aranzmana. Izbacii jedno putovanje iz ponude.
Sa putovanja izbacitti jednog od putnika.
Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka
*/
import java.util.ArrayList;
import java.util.List;

public class RoadTrip {

	public static void main(String[] args) {
		Putnik p1 = new Putnik("Boris", "Nedeljkovic", 54356);
		Putnik p2 = new Putnik("Dragojlo", "Sumardzic", 65432);
		Putnik p3 = new Putnik("Nenad", "Njegosavljevic", 45634);
		Putnik p4 = new Putnik("Sinan", "Sremus", 68623);
		Putnik p5 = new Putnik("Leonardo", "DiCaprio", 32432);
		Putnik p6 = new Putnik("Robert", "DeNiro", 57357);
		
		List<Putnik> listaPutnikaNem = new ArrayList<Putnik>();
		listaPutnikaNem.add(p1);
		listaPutnikaNem.add(p2);
				
		List<Putnik> listaPutnikaGrc = new ArrayList<Putnik>();
		listaPutnikaGrc.add(p3);
		listaPutnikaGrc.add(p4);
		
		List<Putnik> listaPutnikaSve = new ArrayList<Putnik>();
		listaPutnikaSve.add(p5);
		listaPutnikaSve.add(p6);
		
		Putovanje nem = new Putovanje("Nemacka", 500, listaPutnikaNem);
		Putovanje grc = new Putovanje("Grcka", 300, listaPutnikaGrc);
		Putovanje sve = new Putovanje("Svedska", 700, listaPutnikaSve);
		
		List<Putovanje> ponuda = new ArrayList<Putovanje>();
		ponuda.add(nem);
		ponuda.add(grc);
		ponuda.add(sve);
		System.out.print("Ponuda destinacija: ");
		for (int i = 0; i < ponuda.size(); i++) {
			System.out.print(ponuda.get(i).getDestinacija() + " ");
		}
		
		nem.setCena(450);
		System.out.println("");
		System.out.println("Cena putovanja za Nemacku sada je: " + nem.getCena());
		
		ponuda.remove(2);
		System.out.println("Sa ponude smo skinuli Svedsku");
		System.out.print("Nova ponuda: ");
		for (int i = 0; i < ponuda.size(); i++) {
		System.out.print(ponuda.get(i).getDestinacija() + " ");
		}
		System.out.println();

		System.out.println("Sadasnja lista putnika za grcku: ");
		for (int i = 0; i < listaPutnikaGrc.size(); i++) {
			System.out.print(listaPutnikaGrc.get(i).getIme() + " ");
		}
		System.out.println();
		listaPutnikaGrc.remove(1);
		
		System.out.println("Promenjena lista putnika za grcku: ");
		for (int i = 0; i < listaPutnikaGrc.size(); i++) {
			System.out.print(listaPutnikaGrc.get(i).getIme() + " ");
	
		

}
}
	}
