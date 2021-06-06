package zadaci;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		// Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci one koji su deljivi brojem k.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj k");
		int k = sc.nextInt();
		int sum = 0;
		while (k > 0) {
			System.out.println("Unesite broj n");
			int n = sc.nextInt();
			if (n%k==0) {
			continue;
		}
		sum = n+sum;
		System.out.println("Zbir je " + sum);
		
	}
		
}
	}