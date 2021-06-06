package drugiZadatakOpet;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		TeretnoVozilo t1 = new TeretnoVozilo("Jamaha", "Kamion", 500, 100);
		t1.dodajTeret(400);
		t1.skloniTeret(100);
		String a = t1.toString();
		System.out.println(a);
		Putnik p1 = new Putnik("Lolas", 150);
		Putnik p2 = new Putnik("Golas", 300);
		List <Putnik> listaPutnika = new ArrayList<Putnik>();
		listaPutnika.add(p1);
		listaPutnika.add(p2);
		PutnickoVozilo pv1 = new PutnickoVozilo("Ikar", "Bus", 1000, listaPutnika);
		System.out.println(pv1.toString());
		pv1.skloniPutnika(1);
		System.out.println(pv1.toString());
	}

}
