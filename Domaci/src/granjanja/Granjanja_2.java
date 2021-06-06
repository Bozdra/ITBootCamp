package granjanja;

import java.util.Scanner;

public class Granjanja_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Duzina prve ivice prostorije: ");
		int duzina = sc.nextInt();
		if (duzina <= 0) {
			System.out.println("Nedozvoljena vrednost");
		}
		System.out.println("Duzina druge ivice prostorije: ");
		int sirina = sc.nextInt();
		if (sirina <= 0) {
			System.out.println("Nedozvoljena vrednost");
		}
		System.out.println("visina vertikalne ivice prostorije: ");
		int visina = sc.nextInt();
		if (visina <= 0) {
			System.out.println("Nedozvoljena vrednost");
		}
		if (duzina <= 0 || sirina <= 0 || visina <= 0 ) {
			System.out.println("Uneli ste nedozvoljene vrednosti");
		}
		else {
		int ukupnaPovrsina = 2*(visina*duzina+visina*sirina)+(duzina*sirina);
		
		System.out.println("ukupna povrsina zidova je:" +ukupnaPovrsina);
	}
	}
	}

/* Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina 
(kakvi celi brojevi moraju da budu visina, sirina i duzina?) */

