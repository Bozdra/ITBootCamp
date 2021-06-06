package inheritance;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		
		List<Sportista> lista = new ArrayList<Sportista>();
		
		Sportista s1 = new Sportista("Filip", "Filipovic", 1990);
		Teniser t = new Teniser("Novak", "Djokovic", 1987, 1);
		
		Kosarkas k = new Kosarkas("Nikola", "Jokic", 1995, 2.11);
		
		Sahista s = new Sahista("Alisa", "Maric", 1970, "Velemajstor");
		k.setVisina(1.95);
		t.setRang(2);
		System.out.println(k.getIme());
		
		lista.add(t);
		lista.add(k);
		lista.add(s);
		lista.add(s1);
		
		Sportista sss = lista.get(1);
		
		if (sss instanceof Kosarkas) {
			Kosarkas k1 = (Kosarkas) sss;
			System.out.println(k1.getVisina());
		}
	
	}

}
