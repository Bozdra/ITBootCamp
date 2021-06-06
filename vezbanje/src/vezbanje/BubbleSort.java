package vezbanje;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] niz = {6, 2, 3, 1, 9, 23};
		sortiraj(niz);
		ispisNiza(niz);
	}
	public static void sortiraj(int [] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i+1; j < niz.length; j++) {
				if (niz [i] > niz [j]) {
					int pom = niz[j];
					niz [j] = niz [i];
					niz [i] = pom;
				}
			}
		}
	}
	public static void ispisNiza(int[] niz) {
		for(int i = 0; i < niz.length; i++) {
			System.out.println(niz[i] + " ");
		}
	}

}
