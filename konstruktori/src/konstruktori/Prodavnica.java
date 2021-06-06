package konstruktori;

public class Prodavnica {

	public static void main(String[] args) {
		Kosulja k1 = new Kosulja ('z', 38, "cvetna");
		Kosulja k2 = new Kosulja ('m', 43, "karirana");
		Kosulja k3 = new Kosulja ('d', 6, "na pruge");
		
		char modelDrugeKosulje = k2.getModel();
		System.out.println(modelDrugeKosulje);
		
		char modelPrveKosulje = k1.getModel();
		System.out.println(modelPrveKosulje);
		
		k1.setCena(1500);
		System.out.println(k1.getCena());
		k2.setCena(1000);
		System.out.println(k2.getCena());
		k3.setCena(1000);
		System.out.println(k3.getCena());
		
		int cena1 = k1.getCena();
		int cena2 = k2.getCena();
		int cena3 = k3.getCena();
		int sum = cena1+cena2+cena3;
		System.out.println(sum);
	}
}
