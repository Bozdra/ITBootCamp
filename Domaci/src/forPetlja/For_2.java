package forPetlja;

import java.util.Scanner;

public class For_2 {

	public static void main(String[] args) {
		// For2: Napisati program koji ce na standardnom izlazu ispisati zbir prirodnih
		// brojeva do n na sledeci nacin:
		// 1) u zbir nece ulaziti brojevi deljivi brojem 5
		// 2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir
		// brojeva do tog trenutka.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int x = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < x; i++) {

			if (i % 5 == 0) {
				continue;
			}
			if (i == 13) {
				break;
			}
			sum = i + sum;
		}
		System.out.println(sum);

	}
}