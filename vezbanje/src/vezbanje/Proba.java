package vezbanje;

import java.util.Scanner;

public class Proba {
	public static void main(String[] args) {
		/*
		 * Zadatak je pomoci buducim majkama da izracunaju visinu mesecnih primanja
		 * tokom trudnickog odsustva. Naknada se racuna kao zbir zarada u prethodnih 6
		 * meseci podeljen na 6. Korisnica na standardni ulaz unosi plate u prethidnih 6
		 * meseci. Ne mora uneti svih 6 plata, ako u jednom trenutku unese 0 smatrati da
		 * nije imala vise primanja, prekinuti unos i ispisati iznos mesecne naknade.
		 * Npr. ako je zena radila svih 6 meseci pre odlaska na bolovanje njen unos ce
		 * biti racimo: 400, 400, 500, 500, 600, 600 i naknada koju treba da primi je
		 * 500. Ako je radila samo tri meseca unos ce biti 400, 500, 600, 0 i naknada
		 * koju treba da primi je 250.
		 * 
		 * Na standardni izlaz ispisati poruku "Unesite 1. platu:", zatim sacekati da
		 * korisnica unese, pa ispisati "Unesite 2.platu", sacekati unos itd. Kada se
		 * unos zavrsi ispisati poruku "Mesecna naknada tokom bolovanja je xxx."
		 */

		
		Scanner sc = new Scanner(System.in);
		
		double sumPlata = 0;

		for (int i=1; i<=6;i++) {
			System.out.println("Unesite "+i+" platu");
			double plata = sc.nextDouble();
			if (plata == 0) {
				break;
			}
			while (plata < 0) {
				System.out.println("Unesite "+i+" platu ponovo");
				 plata = sc.nextDouble();
			}
			sumPlata = plata+sumPlata;
		}
		double naknada = sumPlata/6;
		System.out.println(naknada);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		

/*
 * 
 * //Postoje dve lozinke npr. Zlatibor i Tara. Ako korinik unese tacno bilo koju
 * od njih ispisati "Pogodio si!".
 * 
 * //Ne treba voditi racuna o velikim i malim slovima. Npr. ako je lozinka Tara
 * validno je: TARA, tara, Tara, tarA itd. Scanner sc = new Scanner(System.in);
 * String lozinka2 = "Password123"; String lozinka = "Sifra123";
 * 
 * String s3 = lozinka.toLowerCase();
 * 
 * for (int i = 0; i<3; i++) { String input = sc.nextLine(); s3 =
 * lozinka.toLowerCase(); String s4 = lozinka2.toLowerCase(); String s2 =
 * input.toLowerCase(); if (s2.equals(s3)) { System.out.println("Pogodio si!");
 * break; } else if (s2.equals(s4)) { System.out.println("Pogodio si"); } else
 * if (i<3) { System.out.println("Pogresio si"); } 
 * 
 * 
 * 
 * } } }
 */

/*
 * Scanner console = new Scanner(System.in); int num;
 * 
 * System.out.print("Enter any positive integer: "); num = console.nextInt();
 * 
 * System.out.println("Multiplication Table of " + num);
 * 
 * for(int i=1; i<=10; i++) { System.out.println(num +" x " + i + " = " +
 * (num*i) );
 */