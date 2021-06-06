package vezbanje;

import java.util.Scanner;

public class Zadacic {

	public static void main(String[] args) {
		// Napisati funkciju koja kao argumente prima dva cela broja. Funkcija vraca true ako su oba broja parna, u suprotnom vraca false.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj");
		int a = sc.nextInt();
		System.out.println("Unesite drugi broj");
		int b = sc.nextInt();
		boolean flag = true;
		funkcija(flag);
	}
	public static boolean funkcija(flag) {
		
		if (a % 2 == 0 && b % 2 == 0) {
			System.out.println("Parni su");
		} else {
			System.out.println("Nisu parni");
		}
		
}
}
