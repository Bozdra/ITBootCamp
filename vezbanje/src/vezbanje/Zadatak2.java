package vezbanje;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Napisati funkciju koja prima dva decimalna broja kao argumente i nakon izvrsavanja vraca veci od ta dva broja.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj");
		double a = sc.nextDouble();
		System.out.println("Unesite drugi broj");
		double b = sc.nextDouble();
		System.out.println("Unesite treci broj");
		double c = sc.nextDouble();

		double n = max(a,b,c);
		double n1 = min(a,b,c);
		System.out.println("Najveci broj je: "+ n);
		System.out.println("Najmanji broj je: "+ n1);

	}
	public static double max(double a, double b, double c) {
		if (a<b && c<b) {
			return b;
		} else if (a>c && a>b) {
			return a;
		} else {
			return c;
		}
	}
	public static double min(double a, double b, double c) {
		if (a>b && b<c) {
			return b;
		} else if (a<c && a<b) {
			return a;
		} else {
			return c;
		}

}
}