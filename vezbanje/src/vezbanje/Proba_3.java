/* package vezbanje;

import java.util.Scanner;

public class Proba_3 {

	public static void main(String[] args) {
		//Write a program to calculate the sum of first 10 natural number

		
				double ukupanIznos = 0;
		double kusur = 0;
		do {
			String mainMenu = "0. Izlaz iz programa\n" + "1. Dodavanje cene proizvoda na racun\n"
					+ "2. Naplata racuna\n";
			System.out.println(mainMenu);
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			switch (x) {
			case 0: {
				System.out.println("Program je zavrsen");
				System.exit(0);
			}
			case 1: {
				double unos = 0;
				do {
					System.out.println("Unesi cenu proizvoda: ");
					unos = sc.nextDouble();
					ukupanIznos = ukupanIznos + unos;
					System.out.println("Ukupan iznos je: " + ukupanIznos);
				} while (unos > 0);
			}
			case 2: {
				System.out.println();
				System.out.println("Unesite kolicinu novca kojom zelite da platite: ");
				double racun = sc.nextDouble();
				if (racun < ukupanIznos) {
					System.out.println("Greska");
					break;
				}
				kusur = racun - ukupanIznos;
				System.out.println("Vas kusur je: " + kusur + "\n");
				ukupanIznos = 0;
				break;
			}
			default:
				System.out.println("Greska");
				break;
			}
		} while (kusur >= 0);
	}
}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		 for(int i=0;i<=5;i++)
		   {
		     for(int j=1;j<=5-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 
		   for(int i=5-1;i>=1;i--)
		   {
		     for(int j=1;j<=5-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
			 
			
		}
		
	}
}*/

	


