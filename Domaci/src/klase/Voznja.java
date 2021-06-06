package klase;

public class Voznja {

	public static void main(String[] args) {
		Automobil a1 = new Automobil ("Tojota", "Jaris", 143);
		Automobil a2 = new Automobil ("Ford", "Fokus", 45);
		
		String modelAuta = a1.getModel();
		System.out.println(modelAuta);
		
		String markaAuta = a1.getMarka();
		System.out.println(markaAuta);
		
		int serijskiBrojAuta = a1.getSerijskiBroj();
		System.out.println(serijskiBrojAuta);
		
		a1.setVlasnik("Boris");
		
		String vlasnikAuta = a1.getVlasnik();
		System.out.println(vlasnikAuta);
	}

}
