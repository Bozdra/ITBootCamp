package klase;

import java.util.ArrayList;
import java.util.List;
//Clan Kriznog staba sadrzi podatke o imenu, prezimenu, zanimanju i listi omiljenih vakcina tog clana. Vakcina je predstavljena kao string.
//U glavnom programu napraviti clanove Predraga Kona, Dariju Kisic Tepavcevic i Branimira Nestorovica. Dodati ih u lisu nazvanu krizni stab.
//Izbaciti doktora Nestorovica iz liste. Doktorki Kisic Tepavcevic promeniti zanimanje iz doktorka u ministarka.



public class KrizniStab {

	public static void main(String[] args) {
		
		Vakcine putnik = new Vakcine ("Putnik", "Russia");
		Vakcine sino = new Vakcine("Kinez", "China");
		
		List<Vakcine> listaVakcina = new ArrayList<Vakcine>();

	
		listaVakcina.add(putnik);
		listaVakcina.add(sino);
		
	
		ClanKriznogStaba predrag = new ClanKriznogStaba("Predrag", "Kon", "Doktor", listaVakcina);
		ClanKriznogStaba darija = new ClanKriznogStaba("Darija", "Kisic Tepavcevic", "Doktor", listaVakcina);
		ClanKriznogStaba branimir = new ClanKriznogStaba("Branimir", "Nestorovic", "''Doktor''", listaVakcina);
		List<ClanKriznogStaba> krizniStab = new ArrayList<ClanKriznogStaba>();
		krizniStab.add(predrag);
		krizniStab.add(darija);
		krizniStab.add(branimir);
		
		krizniStab.remove(2);
		System.out.println(krizniStab.get(1).getVakcine().get(1).getZemljaPorekla());
		
		System.out.println(krizniStab.get(1).getIme());
		
		
		krizniStab.get(1).setZanimanje("Ministarka");
		String novoZanimanje = krizniStab.get(1).getZanimanje();
		System.out.println(novoZanimanje);
	}

}
