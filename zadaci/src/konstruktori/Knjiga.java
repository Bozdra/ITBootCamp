package konstruktori;

public class Knjiga {
	private String naslov;
	private String autor;
	private int brojPrimeraka;
	private int cena;
	
	public Knjiga (String naslov, String autor, int brojPrimeraka, int cena) {
		this.naslov = naslov;
		this.autor = autor;
		this.brojPrimeraka = brojPrimeraka;
		this.cena = cena;
	}
	public String getNaslov () {
		return naslov;
	}
	public String getAutor() {
		return autor;
	}
	public int getBrojPrimeraka() {
		return brojPrimeraka;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public void setBrojPrimeraka(int brojPrimeraka) {
		this.brojPrimeraka = brojPrimeraka;
	}
	public void setAutor(String a) {
		this.autor = a;
	}
	
	
	
	public static void main(String[] args) {
		// Napisati klasu knjiga koja sadrzi atribute naslov, autor, broj prodatih primeraka i cena. Napraviti odgovarajuce konstruktore
		//, getere i setere.U glavnom programu igrati se sa ovom klasom.
		//Bonus: **** u klasi knjiga napraviti funkciju koja racuna koliko je profit ostvaren od prodaje te knjige.
		Knjiga k1 = new Knjiga ("1984", "Orwell", 100, 50);
		Knjiga k2 = new Knjiga ("Farma Zivotinja", "Orwell", 200, 100);
		int zarada = k1.getCena() * k1.getBrojPrimeraka();
		int cene = k1.getCena()+k2.getCena();
		System.out.println(cene);
		System.out.println(zarada);
		System.out.println(k1.getAutor());
		String a = "Boris";
		k1.setAutor(a);
		System.out.println(k1.getAutor());
		
	}

}
