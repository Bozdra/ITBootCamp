package klaseNasledjivanje;

public class Zivotinje {
/*Zivotinje

U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu, konkretan naziv i omiljenu hranu.

Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti boju dlake.
*/
	private String vrsta; 
	private String naziv;
	public Zivotinje(String vrsta, String naziv) {
		super();
		this.vrsta = vrsta;
		this.naziv = naziv;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getHrana() {
		return hrana;
	}
	public void setHrana(String hrana) {
		this.hrana = hrana;
	}
	private String hrana;
}
