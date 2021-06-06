package klase;

public class Sportista {
/*sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi. 

Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
*/
	private String imeIPrezime;
	private String sport;
	private String klub; 
	private int brojDresa;
	
	public Sportista (String imeIPrezime, String sport, String klub, int brojDresa) {
		this.imeIPrezime = imeIPrezime;
		this.sport = sport;
		this.klub = klub;
		this.brojDresa = brojDresa;
	}
	public String getimeIPrezime() {
		return imeIPrezime;
	}
	public String getSport() {
		return sport;
	}
	public String getKlub() {
		return klub;
	}
	public int getBrojDresa() {
		return brojDresa;
	}
	public void setKlub(String a) {
		this.klub = a;
	}
	public void setBrojDresa (int brojDresa) {
		this.brojDresa = brojDresa;
	}
	
	
	
	public static void main(String[] args) {
		Sportista fudbaler = new Sportista ("Jovan Kovalj", "Fudbal", "Partizan", 5);
		Sportista kosarkas = new Sportista ("Miodrag Bjeli", "Kosarka", "Zvezda", 8);
		Sportista hokejas = new Sportista ("Dragoslav Caric", "Hokej", "Beograd", 2);
		
		String imena = fudbaler.getimeIPrezime() + " " + kosarkas.getimeIPrezime() +  " " + hokejas.getimeIPrezime();
		System.out.println(imena);
		
		String sport = fudbaler.getSport() + " " + kosarkas.getSport() +  " " + hokejas.getSport();
		System.out.println(sport);
		
		String klub = fudbaler.getKlub() + " " + kosarkas.getKlub() +  " " + hokejas.getKlub();
		System.out.println(klub);
		
		String brojDresa = fudbaler.getBrojDresa() + " " + kosarkas.getBrojDresa() +  " " + hokejas.getBrojDresa();
		System.out.println(brojDresa);

		kosarkas.setKlub("Vozdovac");
		System.out.println(kosarkas.getKlub());
		
		kosarkas.setBrojDresa(7);
		System.out.println(kosarkas.getBrojDresa());
	}
}
