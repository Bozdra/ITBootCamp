package sintaksa_1;

import java.util.Scanner;

public class Sintaksa_1 {

	public static void main(String[] args) {
/*1.	Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
 *  tako sto se ivice prostorije ucitavaju preko konzole. 
 * (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
 */
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("Duzina prve ivice prostorije: ");
		int duzina = sc.nextInt();
		
		System.out.println("Duzina druge ivice prostorije: ");
		int sirina = sc.nextInt();
		
		System.out.println("visina vertikalne ivice prostorije: ");
		int visina = sc.nextInt();
		
		
		int ukupnaPovrsina = 2*(visina*duzina+visina*sirina)+(duzina*sirina);
		
		System.out.println("ukupna povrsina zidova je:" +ukupnaPovrsina);
		
	}

}
