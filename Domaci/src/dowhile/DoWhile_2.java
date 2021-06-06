package dowhile;

import java.util.Scanner;

public class DoWhile_2 {

	public static void main(String[] args) {
		// DoWhile2: Napisati program koji ce korisniku ispisati poruku da li je ceo pozitivan broj koji je uneo palindrom ili 
		// nije palindrom. (palindromi -> isto mu dodje citali sleva nadesno ili s desne
		// na levu stranu).
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int b = 0;
		int pomocni = x;
		while (x > 0) {
			int cifra = x % 10;
			b = (b * 10) + cifra;
			x = x / 10;
		}
		if (b == pomocni) {
			System.out.println("Broj je palindrom");
		} else {
			System.out.println("Broj nije palindrom");
		}

	}
}


