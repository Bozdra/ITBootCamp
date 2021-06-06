package sah;

import java.util.Scanner;

public class SahovskaTabla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi beli red");
		int beliRed = sc.nextInt();
		System.out.println("Unesi belu kolonu");
		int belaKolona = sc.nextInt();
		System.out.println("Unesi crni red");
		int crniRed = sc.nextInt();
		System.out.println("Unesi crnu kolonu");
		int crnaKolona = sc.nextInt();
		if ((crniRed + 1) == beliRed && (belaKolona + 1) == crnaKolona || (belaKolona - 1) == crnaKolona) {
			System.out.println("Napadnut je konj");
		} else {
			System.out.println("Nije napadnut");
		}
	}
}
