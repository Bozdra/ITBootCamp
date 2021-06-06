package zadaci;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		// Cest zadatak na intervjuu: Napisati program gde korisnik unosi n brojeva i
		// ispisuje maksimalni i minimalni broj.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva");
		int duzina = sc.nextInt();
		int[] niz = new int[duzina];
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite broj");
			niz[i] = sc.nextInt();
		}
		int max = max(niz);
		System.out.println("Maksimalni broj je " + max);
		int min = min(niz);
		System.out.println("Minimalni broj je " + min);

	}

	public static int max(int[] niz) {
		int max = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			}
		}
		return max;
	}

	public static int min(int[] niz) {
		int min = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < min) {
				min = niz[i];
			}
		}
		return min;
	}
}