package vezbanje;

import java.util.Scanner;

public class Nizovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int [] niz = new int[4];
	//	System.out.println(niz[1]);
		Scanner sc = new Scanner(System.in);
		/*
		niz [0] = 9;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Unesite " + i + ". element niza");
			niz[i] = sc.nextInt();
		}
		System.out.println(niz[0] +" " + niz[1] + " " + niz[2] + " " + niz[3]);
		ispisNiza(niz);
	}
	public static void ispisNiza (int[] nizic) {
		nizic [3] = 15;
		for (int i = 0; i<nizic.length; i++) {
			System.out.print(nizic[i] + " ");
		}
		
	}


	
	
	*/
	
	
	System.out.println("Unesite duzinu niza.");
	int duzina = sc.nextInt();
	
	int[] niz = new int[duzina];
	
	for (int i = 0; i<duzina; i++) {
		System.out.println("Unesite " + (i + 1) + ". element niza");
		niz[i] = sc.nextInt();
	}
	int pobednik = maks(niz); 
		System.out.println("Najveci element niza je: " + pobednik);		
				
	}
	
	
public static int maks (int[] nizic) {
	int max = -1;
	
	for (int i = 0; i<nizic.length; i++) { //moze da se koristi za bilo koje duzine nizova
		if (nizic[i] > max) {
			max = nizic[i];
		}
	}
	return max;
}

}
