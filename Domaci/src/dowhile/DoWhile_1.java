package dowhile;

import java.util.Scanner;

public class DoWhile_1 {

	public static void main(String[] args) {
		/* DoWhile1: Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze. 
		On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca treba da kupi BUSPLUS kartu i vrati se kuci sa 
		novogodisnjim poklonima. Pera treba  da unosi pojedinacne cene poklona, a program treba da ga obavesti kada potrosi sav 
		predvidjeni novac, to jest kada za sledeci poklon vise nema kinte.*/
		System.out.println("Pero, unesi cifru");
		Scanner sc = new Scanner(System.in);
		int novac = sc.nextInt();
		System.out.println("Kolicina novca je: " + novac);
		int i = 0;
		do {
			System.out.println("Unesi cenu poklona");
			int poklon = sc.nextInt();
			novac = novac - poklon;
			i++;
			if (novac < 89) {
				System.out.println("Nemas za taj poklon");
				novac = novac + poklon;
				i--;
				
			}
			else if (novac == 89) {
				System.out.println("Imas tacno za kartu");
			} 
			System.out.println("Kolicina novca je: " + novac);
			  System.out.println("Broj poklona je: " + i);
			}  while (novac > 89);
		}
}
