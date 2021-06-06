package testNGVezbanje;

import java.util.UUID;

public class GlavniProgram {

	public static void main(String[] args) {
		Primer p1 = new Primer(1);
		Primer p2 = new Primer(2);
		p1.setBroj(10);
		System.out.println(Primer.getBroj());

		Primer.setBroj(3);
		System.out.println(p1.getBroj());
		
		UUID uuid = UUID.randomUUID();   // stvara random ID
		System.out.println(uuid);
	}

}
