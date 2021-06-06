package testNGVezbanje;

public class Primer {
	
	private static int broj;
	private int a;
	
	
	public Primer(int a) {
		super();
		this.a = a;
	}


	public static int getBroj() {
		return broj;
	}


	public static void setBroj(int broj) {
		Primer.broj = broj;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}
	
	
	
	

}
