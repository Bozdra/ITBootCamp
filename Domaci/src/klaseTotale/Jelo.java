package klaseTotale;

import java.util.List;

/*Jelo imai svoj naziv i proizvoljno mnogo sastojaka, a za svaki 
 * sastojak treba znati i koliko grama je potrebno. 
Pri kreiranju se zadaje samo naziv jela.
Treba napraviti metodu koja ce omoguciti dodavanje sastojka koja izgleda ovako:
public void dodajSastojak(Sastojak s, int kolicina);
Lista sastojaka moze da se dohvati, kao i naziv.
U klasi jelo postoji metoda koja racuna koliko novca je potrebno da bi se sve namirnice nabavile.
*/
public class Jelo {

	private String naziv;
	
	List<Sastojak> lista;
	
	
	public Jelo(String naziv, List<Sastojak> lista) {
		super();
		this.naziv = naziv;
		this.lista = lista;
	}

	public String getNaziv() {
		return naziv;
	}

	public List<Sastojak> getLista() {
		return lista;
	}
	public void dodajSastojak(Sastojak s1, double kolicina) {
		lista.add(s1);
		s1.setKolicina(kolicina);

	}
	public static double cenaNamirnica(List<Sastojak> lista) {
		double cenaNamirnica = 0;
	
		for (int i = 0; i < lista.size(); i++) {
		cenaNamirnica = (lista.get(i).getCenaKg()/1000) * lista.get(i).getKolicina() + cenaNamirnica;
	}   return cenaNamirnica;
}
}