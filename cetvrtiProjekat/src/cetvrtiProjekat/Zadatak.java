package cetvrtiProjekat;

import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {
		// Korisnik unosi broj preko konzole. Pronaci zbir cifara tog broja i ispistai na standardni izlaz.
		Scanner sc = new Scanner(System.in);
		int broj = sc.nextInt();
		int zbir = 0;
		int cifra;
		do  {
			cifra = broj % 10;                     // nalazi cifru broja, od 53105 ostavlja 5 jer samo 5 nije stalo u 10
			zbir = zbir + cifra;
			broj = broj/10;                        //smanjuje  1535 ma 153, 5 si vec stavio u zbir 
			
		}	while (broj != 0);
		
		System.out.println(zbir);
	}

}
