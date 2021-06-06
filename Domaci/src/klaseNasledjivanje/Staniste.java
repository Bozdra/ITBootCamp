package klaseNasledjivanje;

import java.util.ArrayList;
import java.util.List;

/*Zivotinje

U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu, konkretan naziv i omiljenu hranu.

Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti boju dlake.
*/
public class Staniste {
	
private String naziv;
private List<Zivotinje> zivotinjke;

	public Staniste(String naziv, List<Zivotinje> zivotinjke) {
	super();
	this.naziv = naziv;
	this.zivotinjke = zivotinjke;
}

	public String getNaziv() {
		return naziv;
	}
	public List<Zivotinje> getZivotinjke() {
	return zivotinjke;
}
	public void setZivotinjke(List<Zivotinje> zivotinjke) {
		this.zivotinjke = zivotinjke;
	}

}
