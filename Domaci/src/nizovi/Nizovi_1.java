package nizovi;

import java.util.Scanner;

public class Nizovi_1 {

	public static void main(String[] args) {
		// Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji su tipa int.
		// Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili nije. 
		// Na standradnom izlazu obavestiti krajnjeg korisnika njemu rtekstom da liazumljivim  je unesen niz palindrom.
		// Primer ucitanog niza koji je palindrom: 12 46 17 46 12
		// Primer ucitanog niza koji nije palindrom: 12 46 17 12 64
		int[] niz = { 0 };
		niz = unosNiza(niz);

		boolean flag = palindrom(niz);
		if (flag) {
			System.out.println("Niz je palindrom");
		} else {
			System.out.println("Nije palindrom");
		}

	}

	public static boolean palindrom(int[] niz) {
		boolean flag = true;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == niz[(niz.length - i - 1)]) {
				return flag;
			}
		}
		return false;
	}

	public static int[] unosNiza(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int duzina = sc.nextInt();
		niz = new int[duzina];
		for (int i = 0; i < duzina; i++) {
			System.out.println(i + ". element niza");
			niz[i] = sc.nextInt();
		}
		return niz;
	}
}
		
