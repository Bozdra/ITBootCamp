package zadaci;

	import java.util.Scanner;

	public class Zadatak_8 {

	   public static void main(String[] args) {
	       //Ovaj kod predstavlja kalkulator povrsina
	       //kvadrata, pravougaonika i kruga.
	       //Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
	       //Ukoliko se unese 'izadji', program treba da se zavrsi.
	       //Program treba da se ponavlja dokle god se ne unese izadji.

	       Scanner sc = new Scanner(System.in);
	       String figura;
	       while (true) {
	    	   System.out.println("Izaberite figuru");
	           figura = sc.nextLine();
	           switch (figura) {
	               case "kvadrat":
	                   racunajKvadrat();
	                  break;
	               case "pravougaonik":
	                   racunajPravougaonik();
	                  break;
	               case "krug":
	                   racunajKrug();
	                  break;
	               case "izadji":
	                   return;
	           }
	       }
	   }

	   public static void racunajKrug() {
	       Scanner sc = new Scanner(System.in);
	       double r;
	       System.out.println("Unesi poluprecnik kruga");
	       r = sc.nextDouble();
	       if (r <= 0) {
	           System.out.println("Los unos!");
	           return;
	           
	       }
	       System.out.println("Povrsina kruga je: " + pKruga(r));
	   }

	   public static void racunajPravougaonik() {
	       Scanner sc = new Scanner(System.in);
	       double a, b;
	       System.out.println("Unesite jednu, pa drugu stranicu pravougaonika");
	       a = sc.nextDouble();
	       b = sc.nextDouble();
	       if (a <= 0 || b <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina pravougaonika je: " + pPravougaonika(a, b));

	   }

	   public static void racunajKvadrat() {
	       Scanner sc = new Scanner(System.in);
	       double a;
	       System.out.println("Unesite stranicu kvadrata");
	       a = sc.nextDouble();
	       if (a <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina kvadrata je: " + pKvadrata(a));

	   }

	   public static double pKruga(double r) {
	       return r * r * 3.14;
	   }

	   public static double pKvadrata(double a) {
	       return a * a ;
	   }

	   public static double pPravougaonika(double a, double b) {
	       return a * b;
	   }
	}
