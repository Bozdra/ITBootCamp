package klaseNasledjivanje;

import java.util.ArrayList;
import java.util.List;

public class Biologija {

	public static void main(String[] args) {
		
		Ribe r1 = new Ribe("Kicmenjak", "Keciga", "Recna", "Kostasta");
		Sisari s1 = new Sisari("Kicmenjak", "Crvena Lisica", "Crvena", 4);
		List <Zivotinje> lista = new ArrayList<Zivotinje>();
		lista.add(r1);
		lista.add(s1);
		Staniste ss1 = new Staniste("Begecka Jama", lista);
		
		s1.setBojaDlake("Zuta");
		System.out.println(s1.getBojaDlake());
	}

}

