package petlja_1;

import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj zeljenih lakih noci");
		int a;	
		int x = 0; 
		String c = "Laku noc!";
		a = sc.nextInt();
		while (a > x) {
			System.out.println(c);
			x++;
	    }
		 if (a<0) { 
		    	System.out.println("Dobar dan");
		 }
	}

}


/*
While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta 
*/