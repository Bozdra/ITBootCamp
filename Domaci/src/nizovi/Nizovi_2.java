package nizovi;

import java.util.Scanner;

public class Nizovi_2 {

	public static void main(String[] args) {
		// Napisati program koji izracunava proizvod elemenata niza tipa int,  koji su veci od njihovog indeksa. 
		// Za unos niza i za proizvod koristiti zasebno metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza.
		// Primer ucitanog niza: 3 7 1 4 2 5
		// Primer izracunatog proizvoda: 84
		int [] niz = {0};

		niz = unosNiza(niz);
		int proizvod = proizvod(niz);
		System.out.println(proizvod);
	}

	public static int[] unosNiza(int[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int duzina = sc.nextInt();
		int[] niz = new int[duzina];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static int proizvod(int[] niz2) {
		int sum = 1;
		for (int i = 0; i < niz2.length; i++) {

			if (niz2[i] > i) {
				sum = sum * niz2[i];
			}

		}
		return sum;

	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	/*public static int[] upisNiza(int [] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza");
		int duzina = sc.nextInt();
		int [] niz1 = new int [duzina];
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + i + ". element niza");
			 niz1[i] = sc.nextInt();
		}
		return a;
		}
	
	public static int proizvod (int[] niz2) {
		
		for (int i = 0; i < niz2.length; i++) {
			
			while (niz2[i] > i) {
				int proizvod = proizvod * niz2[i];
				return proizvod;
				pom = proizvod;
			}
	}
		return 0;
		
		*/
		
