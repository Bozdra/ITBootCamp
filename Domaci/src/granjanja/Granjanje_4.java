package granjanja;

import java.util.Scanner;

public class Granjanje_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite Godinu");
		int godina = sc.nextInt();
		System.out.println("Unesite mesec");
		int mesec = sc.nextInt();
		boolean prestupnaGod;  
		
		if(godina % 4 == 0)
        {
            if( godina % 100 == 0)
            {
                if ( godina % 400 == 0) {
                    prestupnaGod = true;
}
                else
                	prestupnaGod = false;
            }
            else
            	prestupnaGod = true;
        }
        else {
        	prestupnaGod = false;
        }
		if (prestupnaGod == true && mesec == 2 ) {
			System.out.println("Mesec sadrzi 28 dana");
		}
		else if (prestupnaGod == false && mesec == 2 ) {
			System.out.println("Mesec sadrzi 29 dana");
		}
		else if (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12 ){
			System.out.println("Mesec sadrzi 31 dan");
}
		else if (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) {
		System.out.println("Mesec sadrzi 30 dana");
}
	}
}

/*4.	Dodatni (neobavezni) zadatak Grananja4: Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana. 
(Vodite racuna o prestupnoj godini!)*/