package testNGVezbanje;

import java.util.ArrayList;
import java.util.List;

public class Objekti {
// pravljenje lista celih brojeva
	public static void main(String[] args) {
		int a = 5;
		
		Double d;
		Character c;
		Boolean b;
		List <Character> lista1 =  new ArrayList<Character>();
		lista1.add('l');
		lista1.add('e');
		lista1.add('l');
		lista1.add('e');
		System.out.println(lista1);
		
		Integer obj = new Integer(5); // zastareloooo
		Integer obj1 = 5;
		
		
		
		List<Integer> lista = new ArrayList<Integer>(); // cela pojenta je dodeljivanje integere u liste
		lista.add(obj1);
		lista.add(obj); // integer u obliku objekta
		lista.add(5);
		
		if (lista.get(1) == 5) {
			System.out.println("Isti su");
		} else {
			System.out.println("Razliciti su!");
		}
		
	}

}
