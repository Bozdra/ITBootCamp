package funkcije;

import java.util.Scanner;

public class Funkcije_3 {

	public static void main(String[] args) {
		//DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima -> 
		//Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode. 
		//Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.
			Scanner sc = new Scanner(System.in);
		
		    System.out.println("Unesite prvi broj");
			int a = sc.nextInt();
			System.out.println("Unesite drugi broj");
			int b = sc.nextInt();
			System.out.println("Unesite treci broj");
			int c = sc.nextInt();
			int max = max(a,b,c);
			System.out.println("Najveci broj: "+ max);
			int sum = sabiranje(a,b,c);
			System.out.println("Zbir brojeva je: " + sum);
	}
	public static int sabiranje(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	public static int max(int a, int b, int c) {
		if (a>b && a>c) {
			return a;
		} else if (b>a && b>c) {
			return b;
		} else  {
			return c;
		}
	}

}
