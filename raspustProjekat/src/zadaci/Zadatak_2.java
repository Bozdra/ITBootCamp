package zadaci;

public class Zadatak_2 {

	public static void main(String[] args) {
		// Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene. 
		// Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih

		/* int x = 3;
		int y = 7;
		int pom = x;
		x = y;
		y = pom;
		System.out.println(y); */
		
		int x = 3;
		int y = 7;
		x = x+y; // x 10
		y = x-y; // y 10 - 7 = 3
		x = x-y; // x 10-3 = 7
		System.out.println(x);
		System.out.println(y);
		}
		
		
		
	}


