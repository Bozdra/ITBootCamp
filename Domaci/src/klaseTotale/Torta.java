package klaseTotale;

import java.util.List;

/*Torta     je jelo za koje se moze doci do informacije o tome da li sadrzi margarin ili ne.
Dodatni zahtev: moze se doci i do informacije o tome koliko procenata sećera postoji u odnosu na celu tortu.
*/
public class Torta extends Jelo {
	
	
public Torta(String naziv, List<Sastojak> lista) {
		super(naziv, lista);
		
	}

public static boolean margarin (List<Sastojak> lista) {
	Boolean margarin = false;
	for (int i = 0; i < lista.size(); i++) {
		if (lista.get(i).getNaziv()== "Margarin") {
			margarin = true;
		}
	} return margarin;
}
public static double secer (List<Sastojak> lista) {
	double ukupnaKolicina = 0;
	double secer = 0;
	double procenatSecera = 0;
	for (int i = 0; i <lista.size(); i++) {
		if (lista.get(i).getNaziv() == "Secer") {
			 secer = lista.get(i).getKolicina();
		}
		ukupnaKolicina = lista.get(i).getKolicina()+ukupnaKolicina;
		procenatSecera = (secer*100)/ukupnaKolicina;
	}
	return procenatSecera;
}
}
