package petlja_1;

import java.util.Scanner;

public class While_1 {

	public static void main(String[] args) {
/*While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int a = 0;
		int zbir = 0;           
		a = sc.nextInt();
		while (a >= 0)	{
	    	zbir = zbir + a;     
	    	System.out.println("zbir =" + zbir);
	    	a = sc.nextInt();
	    
	}

}
}