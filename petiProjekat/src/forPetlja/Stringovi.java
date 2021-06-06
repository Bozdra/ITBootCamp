package forPetlja;

public class Stringovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Tijana";
		String s2 = "TIJANA";

		String s3 = s1.toLowerCase();
		System.out.println(s1 + " " + s1.toLowerCase());

		String s4 = s2.toLowerCase();
		System.out.println(s2 + " " + s4);
		if (s3.equals(s2)) {
			System.out.println("Jednaki su");
		} else {
			System.out.println("nisu");
		}
	}

}
