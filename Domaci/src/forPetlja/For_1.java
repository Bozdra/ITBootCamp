package forPetlja;

import java.util.Scanner;

public class For_1 {

	public static void main(String[] args) {
		// For1: Napisati program koji omoguciti korisniku da unosi recii, sve dok ne unese rec “stop”, 
		//nebitno da li je koristio mala, velika slova ili kombinaciju. Mozete pri radu koristiti petlju po izboru.
		System.out.println("Unesite rec");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s.toLowerCase();
		String s2 = "stop";

		do {
			if (s1.equals(s2)) {
				System.out.println("You stopped the program");
				break;
			}
			System.out.println(s);
			s = sc.nextLine();
			s1 = s.toLowerCase();
			s2 = "stop";

		}

		while (s1 != s2);

	}
}


