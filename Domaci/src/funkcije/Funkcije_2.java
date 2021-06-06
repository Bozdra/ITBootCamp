package funkcije;

import java.util.Scanner;

public class Funkcije_2 {

	public static void main(String[] args) {
		// Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj 
		// program treba da pozove i vrati (u main) proizvod unetih brojeva.
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Unesite prvi broj");
		int a = sc.nextInt();
		System.out.println("Unesite drugi broj");
		int b = sc.nextInt();
		System.out.println("Unesite treci broj");
		int c = sc.nextInt();
	    int n = mnozenje(a,b,c);
	    System.out.println(n);
	}
	public static int mnozenje(int a, int b, int c) {
		
		
		int pomoc = a*b*c;
		return pomoc;
	}

}
