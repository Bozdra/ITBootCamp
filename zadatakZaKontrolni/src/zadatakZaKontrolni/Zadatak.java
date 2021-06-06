package zadatakZaKontrolni;

import java.util.Scanner;

/*Napisati program na programskom jeziku Java koji sluzi za pronalazenje minimuma u nizu. 
korisnik preko standardnog ulaza unosi duzinu niza, a zatim i elemente niza koji su celi brojevi. 
Ukoliko korisnik unese nevalidnu vrednost za duzinu niza ispisati poruku o tome i prekinuti izvrsavanje
programa. Pretpostaviti da ce korisnik uneti prirodne brojeve za elemente niza. Ucitavanje niza izvrsiti
u zasbnoj funkciji. Napisati funkciju minimum kojoj se prosledjuje uneti niz. Funkcija pronalazi minimalan
element niz i vraca njegovu vrednost. Napisati funkciju ponavljanja kojoj se prosledjuje zadati niz i koja
vraca broj ponavljanja minimalnog elemenata niza (npr za niz 1 2 4 1 6 1 vraca 3). Ispisati na standardni
izlaz minimalni element i broj njegovih ponavljanja.
*/
public class Zadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite duzinu niza");
		int duzina = sc.nextInt();
		
		while (duzina<1) {
			System.out.println("Nevalidna duzina niza");
			break;
		}
		int [] niz = new int [duzina];
		
		ispisNiza(niz);
		int min = minimum(niz);
		System.out.println("Minimalni element je " + min);
		int brojPonavljanja = brojPonavljanja(niz);
		System.out.println("Broj ponavljanja je " + brojPonavljanja);
		
		
	}
	public static int[] ispisNiza(int [] niz) {
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i<niz.length; i++) {
			System.out.println("Unesite element niza");
			niz[i] = sc.nextInt();
		}
		return niz;
	}
	
	public static int minimum(int[] niz) {
		int min = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < min) {
				min = niz[i];
			} 
			
		}
		return min;
	}
	public static int brojPonavljanja (int [] niz)	{
			int min = minimum(niz);
			int brojac = 0;
			for (int i = 0; i < niz.length; i++) {
				if (niz [i] == min) {
					brojac ++;
				}
			}
			return brojac;
			
		}

	}
			
				
				
		
	
		
	
	


