package funkcije;

import java.util.Scanner;

public class Funkcije_1 {

	public static void main(String[] args) {
		// Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja) 
		// i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.
		int a = 0;
		int b = 0;
	    int c = 0;
	    int n = min(a,b,c);
		System.out.println(n);
	}
	public static int  min(int a, int b, int c) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite sledeci broj");
			a = sc.nextInt();
			System.out.println("Unesite sledeci broj");
			b = sc.nextInt();
			System.out.println("Unesite sledeci broj");
			c = sc.nextInt(); 
			if (a<b && a <c) {
				return a;
			} else if (b<a && b<c) {
				return b;
			} else  {
				return c;
			}
			
	}

}
