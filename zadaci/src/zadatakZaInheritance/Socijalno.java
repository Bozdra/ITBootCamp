package zadatakZaInheritance;

import java.util.ArrayList;
import java.util.List;



public class Socijalno {

	public static void main(String[] args) {
		/*Napisati klasu Osoba koja sadrzi podatke o imenu, prezimenu i adresi.
		Napisati klasu Djak.  Djak je osoba koja ima podatke o tome u koji razred ide i naziv njegove skole.
		Napisti klasu Zaposleni. Zaposleni je osoba koja ima podatke o tome u kojoj firmi radi 
		i o nazivu odeljenja na kome je zaposlen.
		U mainu-u se igrati sa ovim klasama.
		Tekstualni opis Osobe je Ime Prezime (Adresa).*/

		List<Osoba> listaDjaka = new ArrayList<Osoba>();
		List<Osoba> listaZaposlenih = new ArrayList<Osoba>();

		
		Djak d1 = new Djak("Sava", "Dukic", "Maksima Gorkog 5", 5, "OS Sveti Sava");
		Djak d2 = new Djak("Miroslav", "Milenkovic", "Zorza Klemensoa 10", 2, "OS Sveti Sava");
		Djak dj1 = new Djak("Boris", "Nedeljkovic", "Tu negde", 10, "ITBootCamp");
		Zaposleni z1 = new Zaposleni ("Ivan", "Mandic", "Bulevar Despota Stefana 71", "Frikom", "Merchandising");
		Zaposleni z2 = new Zaposleni ("Nenad", "Mandic", "Bulevar Despota Stefana 71", "Frikom", "Operator na liniji");
		
		
		
		z1.setOdeljenje("Direktor");
		String a = z1.toString();
		System.out.println(a);
		
		listaZaposlenih.add(z1);
		listaZaposlenih.add(z2);
		String a1 = listaZaposlenih.toString();
		System.out.println(a1);
		
		
		
		String a2 = listaDjaka.toString();
		System.out.println(a2);
		d1.setRazred(7);          // ne radi nista
		System.out.println(a2);
		
		listaDjaka.add(d1);
		listaDjaka.add(d2);
		listaDjaka.add(dj1);
		
		
		listaDjaka.get(2);
		Osoba noviDjak = listaDjaka.get(2);
		if (noviDjak instanceof Osoba) {
			Djak dj2 = (Djak) noviDjak;
			System.out.println(dj2.getSkola());
		}
	}

}
