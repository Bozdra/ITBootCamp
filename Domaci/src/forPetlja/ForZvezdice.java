package forPetlja;

import java.util.Scanner;

public class ForZvezdice {

	public static void main(String[] args) {
		// Dodatni neobavezni  For3: Napraviti program koji ce odstampati na standardnom izlazu trougao od zvezdica. 
		//Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati ovako:

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("koliki trougao zelite?");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			for (int c = 1; c < i; c++)
				System.out.print(" ");
			for (int j = x; j >= i; j--)
				System.out.print("*");

			System.out.println();
		}
	}
}


		
		
		
		
		
		
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("koliki trougao zelite?");
		int x = sc.nextInt();
		for (int i = 1; i<=x; i++) {
			for (int j = x; j>=i; j-- ) {
				System.out.println("*");
			}
			System.out.println();
	}

}
}*/