package granjanja;

import java.util.Scanner;

public class Granjanja_3 {

	public static void main(String[] args) {
		System.out.println("Unesite naziv meseca");

		Scanner sc = new Scanner (System.in);
		String mesec = sc.nextLine();
		
		switch(mesec) {
		case "Januar": 
		case "Jun": 
		case "Jul":
		case "januar": 
		case "jun": 
		case "jul":
			System.out.println("3 Meseca pocinju na J");
			break;
		case "Mart":
		case "mart":
		case "Maj":
		case "maj":
			System.out.println("2 Meseca pocinju na M");
			break;
		case "Februar":
		case "februar":
			System.out.println("1 Mesec pocinje na F");
			break;
		case "April":
		case "april":
		case "Avgust":
		case "avgust":
			System.out.println("2 Meseca pocinju na A");
			break;
		case "Septembar":
		case "septembar":
			System.out.println("1 Mesec pocinje na S");
			break;
		case "Oktobar":
		case "oktobar":
			System.out.println("1 Mesec pocinje na O");
			break;
		case "Novembar":
		case "novembar":
			System.out.println("1 Mesec pocinje na N");
			break;
		case "Decembar":
		case "decembar":
			System.out.println("1 Mesec pocinje na d");
			break;
			default:
				System.out.println("Nepostojeci mesec");
		}
	}

}


/*Grananja3: Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini koji pocinju na to slovo(na taj glas) - 
za resavanje ovog zadatka koristiti switch
*/