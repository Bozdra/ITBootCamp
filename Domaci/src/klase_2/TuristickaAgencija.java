package klase_2;

public class TuristickaAgencija {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		
		Dvorana d1 = new Dvorana("Stark Arena", "Beograd", 15000);
		Dvorana d2 = new Dvorana("Pionir", "Beograd", 5000);
		
		Event e1 = new Event(19.00, d1, "Koncert");
		Event e2 = new Event(20.00, d2, "Kosarka");
		
		sb.append("Naziv dvorane je ");
		sb1.append("Kapacitet je ");
		d2.setKapacitet(2000);
		e1.setDvorana(d2);
		
		System.out.println(sb1.toString() + e1.getDvorana().getKapacitet());
		
		e1.setDvorana(d1);
		System.out.println(sb.toString() + e1.getDvorana().getIme());
		
		d1.setIme("Kombank Arena");
		d1.setKapacitet(20000);
		
		e2.setDvorana(d1);
		e2.setTip("Fudbal");
		
		
		System.out.println(sb.toString() + e2.getDvorana().getIme());
		System.out.println();
	}

}
