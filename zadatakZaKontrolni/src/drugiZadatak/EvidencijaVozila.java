package drugiZadatak;

import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {

	public static void main(String[] args) {
		Putnik p1 = new Putnik("Boris", 130);
		Putnik p2 = new Putnik("Janko", 105);
		Putnik p3 = new Putnik("Veljko", 95);
		List <Putnik> listaPutnika = new ArrayList<Putnik>();
		listaPutnika.add(p1);
		listaPutnika.add(p2);
		listaPutnika.add(p3);
		
		
		PutnickoVozilo bus = new PutnickoVozilo("Ikarbus", "Harmonika", 15000 , listaPutnika);
		
		bus.toString();
		
		System.out.println(bus);
		
	}

}
