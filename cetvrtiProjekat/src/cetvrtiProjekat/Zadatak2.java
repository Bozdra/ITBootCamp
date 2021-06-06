package cetvrtiProjekat;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Naci maksimalnu cifru u broju unetom sa konzole i ispisati je.
		Scanner sc = new Scanner(System.in);
		int broj = sc.nextInt();
		int cifra;
		int max = 0;
		do  {
			cifra = broj % 10;                           
			if (cifra>max) {
			max = cifra;
			}
	
			broj = broj/10;
			
		}	while (broj != 0);
		
		System.out.println(max);

}
}