package knjizara;

import java.util.ArrayList;
import java.util.List;

public class Knjizara {

	public static void main(String[] args) {

		Autor a1 = new Autor("Lav", "Tolstoj", 1828);
		Autor a2 = new Autor("Fjodoir", "Dostojevski", 1821);

		Knjiga k1 = new Knjiga("Rat  i mir", a1);
		Knjiga k2 = new Knjiga("Idiot", a2);
		Knjiga k3 = new Knjiga("Zli dusi", a2);

		List<Knjiga> listaKnjiga = new ArrayList<Knjiga>();
		listaKnjiga.add(k1);
		Knjiga RatIMir = listaKnjiga.get(0);
		System.out.println(RatIMir.getAutor().getIme()); 
		
		
		List<Autor> listaAutora = new ArrayList<Autor>();
		listaAutora.add(a1);
		listaAutora.add(a2);
		
		Autor d = listaAutora.get(0);             //koriscenje lista
		System.out.println(d.getPrezime());
		
		System.out.println(listaAutora.get(0).getPrezime());
		System.out.println(listaAutora.get(1).getGodinaRodjenja());
		
		System.out.println(listaAutora.size());
		listaAutora.remove(1);                     // brisanje objekta na tom indeksu
		System.out.println(listaAutora.size());
		System.out.println(listaAutora.get(0).getIme());
		
		
		System.out.println(k1.getAutor().getPrezime());
		System.out.println(k2.getAutor().getIme());

		System.out.println(k2.getNaslov());
		System.out.println(k2.getAutor());

		Autor aaa = k2.getAutor();

		a2.getPrezime();
		aaa.getPrezime();
		k3.getAutor().getPrezime();

		a2.setIme("Fjodor Mihailovic");

		System.out.println(k2.getNaslov());
		System.out.println(k2.getAutor().getIme());

	}
}