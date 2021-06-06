package sah;

import java.util.Scanner;

public class Sahovska2 {

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
		if ((crniRed + 2) == beliRed && (crnaKolona + 1) == belaKolona || (crnaKolona - 1) == belaKolona) {
			System.out.println("Napadnut je pijun");
		} else {
			System.out.println("Nije napadnut");
		}
	}
}
