package cetvrtiProjekat;

import java.util.Scanner;

public class Naopako {

	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cilj;
		do {
			
			cilj = n % 10;
			System.out.print(cilj);
			n = n / 10;
			
		} while (n != 0);
	}

} */
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int cilj;
while (n!=0) {
	
	cilj = n % 10;
	System.out.print(cilj);
	n = n / 10;
	
} 
}

}