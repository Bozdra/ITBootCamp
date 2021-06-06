package drugi;

import java.util.Scanner;

public class Zadatak {
public static void main(String[] args) {
	

	System.out.println("Unesite godine");
	
	Scanner sc = new Scanner(System.in);
	int godine = sc.nextInt();
	
	if (godine == 7) {
		System.out.println("Prvi Razred");
		}
	else if (godine == 8) {
		System.out.println("Drugi Razred");
	}
	else if (godine == 9) {
		System.out.println("Treci Razred");
	}
	else if (godine == 10) {
		System.out.println("Cetvrti Razred");
	}
	else if (godine == 11 ||godine == 12 || godine == 13 || godine == 14) {
		System.out.println("Stariji razredi");
	}
	else  {
		System.out.println("Ne ide u skolu");
	}
}
}
	
	
	
	
	
	
	
	
	

		/*Sa standardnog ulaza procitati godine. Ako je uneto 7 ispistati prvi razered, ako je uneto 8 ispistati drugi razered, 
		 * ako je uneto 9 ispistati treci razered, ako je uneto 10 ispistati cetvrti razered, ako je uneto izmedju 11 i 14 ispisati stariji razredi, 
		 * ako je uneta neka druga vrednost ispisati ne ide u skolu.
		 
		System.out.println("Unesite godine");
		
		Scanner sc = new Scanner(System.in);
		int godine = sc.nextInt();
		
		
		switch (godine) {
	
		case 7:
			System.out.println("Prvi Razred");
			break;
		case 8:
			System.out.println("Drugi Razred");
			break;
		case 9:
			System.out.println("Treci Razred");
			break;
		case 10:
			System.out.println("Cetvrti Razred");
			break;
		case 11:
		case 12:
		case 13:
		case 14:
			System.out.println("Stariji razredi");
			break;
			default:
				System.out.println("Ne ide u skolu");
		}
		
	}
	

}
		*/
		
		
		
		
		