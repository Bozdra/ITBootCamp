package klaseTotale;

import java.util.ArrayList;
import java.util.List;

public class Kuhinja {

	public static void main(String[] args) {
		
		
		j1.dodajSastojak(new Sastojak("Secer", 50), 300);
		
		Sastojak s1 = new Sastojak("Junetina", 1000);
		Sastojak s2 = new Sastojak("Krompir", 50);
		Sastojak s3 = new Sastojak("Paradajz Sos", 700);
		List <Sastojak> listaSastojaka = new ArrayList<Sastojak>();
		
		Jelo j1 = new Jelo("Gulas");
		Jelo j2 = new Jelo("Junetina i Krompir");
		
		
		j1.dodajSastojak(s1,5);
		j1.dodajSastojak(s2,3);
		j1.dodajSastojak(s3,8);
		
		
		
		j2.dodajSastojak(s2, 5);
		j2.dodajSastojak(s1, 1);
		
		listaSastojaka.add(s1);
		listaSastojaka.add(s2);
		listaSastojaka.add(s3);
		for (int i = 0; i < listaSastojaka.size(); i++) {
		System.out.println(j2.getLista().get(i).getNaziv());
		}
		/*
		List <Jelo> listaJela = new ArrayList<Jelo>();
		
		listaJela.add(j1);
		listaJela.add(j2);
		for (int i = 0; i<listaSastojaka.size(); i ++) {
		System.out.println(listaSastojaka.get(i).getNaziv());
		}
		/* Meni m1 = new Meni(listaJela);
		
		String a = m1.toString();
		System.out.println(a); */
	}

}
