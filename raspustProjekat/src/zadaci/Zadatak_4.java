package zadaci;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		// Napisati program koji za tri unete ocene ispisuje srednju vrednost i u numerickom i opisnom obliku 
		// (opisan oblik - odlican, vrlo dobar, dobar, dovoljan, nedovoljan)
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 3 ocene");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double avg = (a + b + c) / 3;
		
		if (avg >= 4.5 && avg <= 5) {
			System.out.println(avg);
			System.out.println("Odlican");
		}
		else if (avg >= 3.5 && avg <= 4.5) {
			System.out.println(avg);
			System.out.println("Vrlo dobar");
		}
		else if (avg >= 2.5 && avg <= 3.5) {
			System.out.println(avg);
			System.out.println("Dobar");
		}
		else if (avg >= 1.5 && avg <= 2.5) {
			System.out.println(avg);
			System.out.println("Dovoljan");
		}
		else if (avg > 0 && avg <= 1.5) {
			System.out.println(avg);
			System.out.println("Nedovoljan");


	}

}
}