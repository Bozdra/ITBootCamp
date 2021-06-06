package klase_2_2;
/*
Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a 
naziv firme moze i da se postavi. Ispisati ceo objekat klase firma. Ispisati prezimena svih zaposlenih u firmi.

Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja.
Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)

Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
*/
public class AgencijaZaZaposlene {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		Zaposleni z1 = new Zaposleni("Marko", "Milosavljevic", "Call Operator", 400);
		Zaposleni z2 = new Zaposleni("Milica", "Draganic", "Call Operator", 400);
		Zaposleni [] zaposleni = {z1, z2};

		Zaposleni z3 = new Zaposleni("Mirko", "Saric", "Sef Linije", 700);
		Zaposleni z4 = new Zaposleni("Zarko", "Nedeljkovic", "Izlagac robe", 300);
		Zaposleni zaposleni1 [] = {z3, z4};
		Firma f2 = new Firma("Frikom", "Beograd", 250135, zaposleni );
		Firma f1 = new Firma("SBB", "Beograd", 1063456, zaposleni1 );

		for (int i = 0; i < zaposleni.length; i++) {
		String zaposlenici = f2.getZaposleni()[i].getPrezime();
		System.out.println(zaposlenici);
		
		
		
		}		
		for (int i = 0; i < zaposleni.length; i++) {
			sb.append(f2.getZaposleni()[i].getIme().toUpperCase());
			sb.append("_");
			sb.append(f2.getZaposleni()[i].getPrezime().toUpperCase());
			sb.append(": ");
			sb.append(f2.getZaposleni()[i].getPozicija().toUpperCase());
			sb.append(" (");
			sb.append(f2.getZaposleni()[i].getPrimanja());
			sb.append(")");
			if (i == 1) {
			System.out.println(sb);
		}
		}
		
		
	}

}
