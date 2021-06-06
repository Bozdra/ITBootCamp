package klase;

import java.util.ArrayList;
import java.util.List;

public class ClanKriznogStaba {
/*Clan Kriznog staba sadrzi podatke o imenu, prezimenu, zanimanju i listi omiljenih vakcina tog clana. Vakcina je predstavljena kao string.
U glavnom programu napraviti clanove Predraga Kona, Dariju Kisic Tepavcevic i Branimira Nestorovica. Dodati ih u lisu nazvanu krizni stab.
Izbaciti doktora Nestorovica iz liste. Doktorki Kisic Tepavcevic promeniti zanimanje iz doktorka u ministarka.
*/
	private String ime;
	private String prezime;
	private String zanimanje;
	private List<Vakcine> vakcine;
	public ClanKriznogStaba(String ime, String prezime, String zanimanje, List<Vakcine> vakcine) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zanimanje = zanimanje;
		this.vakcine = vakcine;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getZanimanje() {
		return zanimanje;
	}
	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}
	public List<Vakcine> getVakcine() {
		return vakcine;
	}
	public void setVakcine(List<String> Vakcine) {
		this.vakcine = vakcine;
	}
	
}
