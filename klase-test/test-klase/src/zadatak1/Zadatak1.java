package zadatak1;

import java.util.Scanner;

/*Prvi zadatak
Napisati program na programskom jeziku Java koji sluzi za pronalazenje niza sa vecim prosecnim elementom. 
Korisnik na standardniu ulaz unosi duzniu prvog niza, a zatim i sve njegove elemente. 
Nakon toga unosi duzinu drugog niza i sve njegove elemente. 
Ukoliko korisnik unese nevalidnu vrednost za duzinu niza ispisati poruku o tome i prekinuti izvrsavanje programa.
Pretpostaviti da ce korisnik uneti cele brojeve za elemente niza. Ucitavanje niza izvrsiti u zasebnoj funkciji. 
Napisati funkciju pronadji kojoj se proslednjuju oba niza.
Funkcija pronadji racuna prosecnu vrednost elementa za oba niza i kao rezultat vreca vecu od te dve prosecne vrednosti.
Na stendardni izlaz ispisati rezultat funkcije.
*/
public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite duzinu prvog niza");
		int duzina = sc.nextInt();
		while (duzina < 1) {
			System.out.println("Nevalidna duzina niza");
			break;
		}
		int [] niz = new int [duzina];
		ucitajNiz(niz);
		System.out.println(niz);
		
		System.out.println("Unesite duzinu drugog niza");
		int duzina1 = sc.nextInt();
		while (duzina1 < 1) {
			System.out.println("Nevalidna duzina niza");
			break;
		}
		int [] niz1 = new int [duzina1];
		ucitajNiz(niz1);
		System.out.println(niz1);
		
		int a = pronadji(niz, niz1);
		System.out.println(a);
		
		
	
	}
	public static void ucitajNiz(int[]niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<niz.length; i++) {
			System.out.println("Unesite " + i + " element niza");
			niz[i] = sc.nextInt();
		}
		
		
	}
	public static int pronadji(int[]niz, int[]niz1) {
		int avg = 0;
		int avg1 = 0;
		for (int i = 0; i < niz.length; i++) {
			avg = niz[i] + avg;
		}
		avg = avg / niz.length;
		for (int i = 0; i < niz1.length; i++) {
			avg1 = niz1[i] + avg1;
		}
		avg1 = avg1 / niz1.length;
		if (avg > avg1) { 
			return avg;
		} else {
			return avg1;
		}
	}

}
