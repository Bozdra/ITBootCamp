package vezbaTryCatch;

public class VezbaTryCatch {

	public static void main(String[] args) {
		int [] niz = {1, 2, 3};
		
		try {
		niz [10] = 19;
		
		int a = niz [1];
		
		} catch (NullPointerException e) {
			
			System.out.println("Doslo je do greske!");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Doslo je do greske");
		} catch (Exception e) {
			
		} finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Kraj programa!");
		
	

}
}