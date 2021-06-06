package zadaci;

import java.util.Scanner;

public class Zadatak_6 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
		//Primer niza: 32 54 123 18
		//Ispis: 18 123 54 32
		Scanner sc = new Scanner(System.in);
		int[] nizov = {0};
		System.out.println("Unesite koliko brojeva zelite");
		int duzina = sc.nextInt();
		int[] niz = new int [duzina];
		int pom = duzina;
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite broj niza");
			niz[i] = sc.nextInt();
	}
		for (int i = niz.length - 1; i>=0; i--) {
			System.out.print(niz[i] + " " );
		}
	}
}


