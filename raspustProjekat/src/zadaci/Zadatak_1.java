package zadaci;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		//Napisati program koji ispisuje koliko cifara ima uneti broj n.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1 ; a > 0 ; i++) {
			a=a/10;
			if (a==0) {
			System.out.println(i);
		}
		}
	}

}
