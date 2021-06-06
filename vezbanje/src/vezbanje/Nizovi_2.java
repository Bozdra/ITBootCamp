package vezbanje;

import java.util.Scanner;

public class Nizovi_2 {

	public static void main(String[] args) {
		// Napisati program koji pomocu jedne funkcije ucitava niz.
		// Nakon toga pomocu druge funkcije izracunava zbir svih brojeva koji se nalaze na parnim pozicijama (0, 2, 4 itd.). 
		// Iz glavnog programa se na standardni izlaz ispisuje rezultat.
		int [] niz = {0};
		niz = unosNiza(niz);
		int suma = suma(niz);
		System.out.println(suma);
	}

	public static int suma(int[] nizic) {
		int sum = 0;
		for (int i = 0; i < nizic.length; i++) {
			if (i % 2 == 0) {
				sum = nizic[i] + sum;
			}
		}
		return sum;
	}
	public static int[]  unosNiza (int[] niz2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliki zelite niz?");
		int duzinaNiza = sc.nextInt();
		
		int[] niz = new int[duzinaNiza];
		for (int i = 0; i < duzinaNiza; i++) {
			System.out.println(i + ". element niza");
			niz[i] = sc.nextInt();
		}
		return niz ;
		
	}

}
