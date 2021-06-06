package vezbanje;

import java.util.Scanner;

public class Proba_2 {

	public static void main(String[] args) {
		//Korisnik unosi dva broja na standardni ulaz. Nakon toga ispisuje mu se meni sa sledecim opcijama:
		//	1. Sabiranje
		//	2. Oduzimanje
		//	3. Mnozenje
		//	4. Deljenje
		//	Kada unese neku od ovih opcija odgovarajuca operacija se izvrsava nad dva uneta broja i ispisuje se razultat na standardni izlaz.
		//	Ako unese nepostojecu opciju ispisati mu poruku "Neispravan unos!"
		Scanner sc = new Scanner(System.in);
		double prviBroj =  sc.nextDouble();
		double drugiBroj =  sc.nextDouble();
		System.out.println("1. Sabiranje");
		System.out.println("2. Oduzimanje");
		System.out.println("3. Mnozenje");
		System.out.println("4. Deljenje");
		int funkcije = sc.nextInt();
		double rezultat = 0;
		switch (funkcije) {
		case 1:
			rezultat = prviBroj+drugiBroj;
			System.out.println(rezultat);
			break;
		case 2:
			rezultat = prviBroj-drugiBroj;
			System.out.println(rezultat);
			break;
		case 3: 
			rezultat = prviBroj*drugiBroj;
			System.out.println(rezultat);
			break;
		case 4:
			rezultat = prviBroj/drugiBroj;
			
			while (prviBroj==0||drugiBroj==0) {
				System.out.println("ne moze sa nulom da se deli!");
				break;
			}
			System.out.println(rezultat);
			break;
		default: 
			System.out.println("neispravan unos");
	}
}
}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Izaberite vakcinu ");
		System.out.println("1. Rusija ");
		System.out.println("2. Kina ");
		System.out.println("3. Amerika");
		
		int izbor =  sc.nextInt();
		switch (izbor) {
		case 1:
			System.out.println("Sputnjik");
			break;
		case 2:
			System.out.println("Sinofarm");
			break;
		case 3:
			System.out.println("Fajzer");
			break;
		case 4:
			System.out.println("Sputnjik");
			break;
		default: 
				System.out.println("ne priznaje medicinu");
		}
	}
}
		
		*/
		
		
		
		
		
		/*
		// Napisati program koji ucitava N brojeva
		// od korisnika i proverava da li se u
		// unetim brojevima nalazi broj K
		// (K takodje unosi korisnik)
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("unesite broj k");
		int k = sc.nextInt();
		while (k != n) {
			System.out.println("unesite broj n");
			n = sc.nextInt();
		}
		System.out.println("pogodili ste");
	}

}
*/