package zadaci;

import java.util.Scanner;

public class Zadatak_7 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
		//Primer1 niza: 3 54 123 18
		//Ispis: Niz nije rastuci.
		//Primer2 niza: 71 422 1001 5054
		//Ispis: Niz je rastuci.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva");
		int duzina = sc.nextInt();
		int[] niz = new int[duzina];
		
		for (int i = 0; i < niz.length ; i++) {
			System.out.println("Unesite broj");
			niz[i] = sc.nextInt();
		}
		boolean nizJeRastuci = nizJeRastuci(niz);
		if (nizJeRastuci) {
			System.out.println("Niz je rastuci");
		} else {
			System.out.println("Niz nije rastuci");
		}
	}
	public static boolean nizJeRastuci(int [] niz) {
		boolean nizJeRastuci = false;
		for (int i = 1; i < niz.length; i++) {
		if (niz[i] > niz[i-1]) {
			nizJeRastuci = true;
			return nizJeRastuci;
		} else {
			return false;
		}
	}
		return nizJeRastuci;

}
}