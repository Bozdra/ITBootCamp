package vezbanje;

public class ZadatcicNiz {

	public static void main(String[] args) {
		// Napisati funkciju koja prima niz stringova. Funkcija vraca indeks prvog elementa koji je napisan svim velikim slovima.
		// Ako ni jedan element niza nije ispisan svim velikim slovima vraca -1.
		

		String [] s = {"Obicno", "Super", "NAJBOLJE", "LOL"};
		int i = indexVelikih(s);
		System.out.println(i);
	}
	public static int indexVelikih (String[]s) {
		for (int i=0;i<s.length;i++) {
			String pom = s[i];
			String pom1 = pom.toUpperCase();
			while (pom.equals(pom1)) {
				return i;
				
			}
			

		} return -1;
		
	}
	

}
