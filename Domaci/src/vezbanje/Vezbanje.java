package vezbanje;

import java.util.Scanner;

public class Vezbanje {

	public static void main(String[] args) {
		System.out.println("Dobro dosli na kasu");
		System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
		System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
		System.out.println("2 - naplata racuna");

		Scanner sc = new Scanner(System.in);
		int izbor = sc.nextInt();
		double sum = 0;
		for (int i = 0; izbor < 3;) {

			if (izbor == 0) {

				if (sum > 0) {
					System.out.println("Niste platili proizovde");
					System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
					System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
					System.out.println("2 - naplata racuna");
					izbor = sc.nextInt();
				} else {
					break;
				}
			} else if (izbor == 1) {
				System.out.println("Unesite cenu proizvoda");
				System.out.println("Ili unesite 0 kako bi ispraznili korpu");
				double cena = sc.nextDouble();
				if (cena < 0) {
					System.out.println("Unesite validnu cenu");
					cena = sc.nextDouble();
				} else {
					if (cena == 0) {
						sum = 0;
						System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
						System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
						System.out.println("2 - naplata racuna");
						izbor = sc.nextInt();
					}
					sum = sum + cena;
					System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
					System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
					System.out.println("2 - naplata racuna");
					izbor = sc.nextInt();
				}
			} else if (izbor == 2) {
				System.out.println("Unesite ukupan racun");
				double racun = sc.nextDouble();
				if (racun <= 0) {
					System.out.println("Niste uneli cene proizvoda");
					System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
					System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
					System.out.println("2 - naplata racuna");
					izbor = sc.nextInt();
				}
				if (racun < sum) {
					System.out.println("Uneli ste premalu sumu");
					System.out.println("Fali vam " + (sum - racun));
					System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
					System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
					System.out.println("2 - naplata racuna");
					izbor = sc.nextInt();
				} else if (racun >= sum) {
					System.out.println("Vas kusur je " + (racun - sum));
					sum = 0;
					System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
					System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
					System.out.println("2 - naplata racuna");
					izbor = sc.nextInt();
				}

			}
		}
	}
}

/*
 * Vezbanje1: Napisati program koji ima meni za samousluznu kasu u prodavnici.
 * Meni za potrosace sadrzi sledece opcije:
 * 
 * 0 - Izlaz iz programa (zatvaranje kase) 1 - dodavanje cene proizvoda na racun
 * (ubacivanje u potrosacku korpu) 2 - naplata racuna
 * 
 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
 * Zatim se ponovo ispisuje meni.
 */

/*
 * switch (izbor) { case 0: System.out.println("Izasli ste iz programa"); break;
 * case 1: System.out.println("Unesite cenu proizvoda"); double cena =
 * sc.nextDouble(); sum = sum + cena;
 * 
 * case 2: System.out.println("Unesite ukupan racun"); double racun =
 * sc.nextDouble(); if (racun < sum) {
 * System.out.println("Uneli ste premalu sumu"); } else if (racun >= sum) {
 * System.out.println("Vas kusur je " + (racun - sum));
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 */
