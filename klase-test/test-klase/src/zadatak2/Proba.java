package zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Proba {

	public static void main(String[] args) {
		Stvar s1 = new Stvar(100, "Majica", 30, 'm');
		System.out.println(s1.toString());
		Odeca od1 = new Odeca(300, "Kosulja", 40, 'z', "Karirano");
		Odeca od2 = new Odeca(500, "Jakna", 50, 'm', "Kozna");
		Odeca od3 = new Odeca(200, "Pantalone", 39, 'm', "Dzins");
		System.out.println(od3.toString());
		List <Odeca> odeca = new ArrayList<Odeca>();
		
		
		Obuca o1 = new Obuca(1000, "Cipelke", 45, 'm', "Koza");
		System.out.println(o1.toString());
		List <Obuca> obuca = new ArrayList<Obuca>();
		
		
		
		Stajling smeker = new Stajling("Boris");
		smeker.setOdeca(odeca);
		
		smeker.dodajOdecu(od1);
		smeker.dodajOdecu(od2);
		smeker.dodajOdecu(od3);
		smeker.setObuca(obuca);
		smeker.dodajObuca(o1);
		System.out.println(smeker.toString());
		
		
	}

}
