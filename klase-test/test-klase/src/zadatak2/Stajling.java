package zadatak2;

import java.util.List;

/*Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih predmeta. 
Prilikom kreiranja stajlinga prosledjuje se samo ime kreatora. Moguce je postaviti, 
dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne predmete, dodati neki odevni predmet,
 kao i ukloniti odevni predmet sa neke pozicije. Odevni predmeti dodaju se pojedinacno, a ne vise njih odjednom. 
 Tekstualni opis je kreator - oznaka stajlinga ? ukupna cena stajlinga. Oznaka stajling je ?z? ukoliko ima vise zenskih stvari, 
 ?m? ukoliko ima vise muskih stvari ili ?u? ukoliko ima jednak broj muskih I zenskih stvari ili su sve stvari unisex*/
public class Stajling {

	private String kreator;
	private List<Obuca> obuca;
	private  List<Odeca> odeca;
	
	public void setOdeca(List<Odeca> odeca) {
		this.odeca = odeca;
	}
	public void setObuca(List<Obuca> obuca) {
		this.obuca = obuca;
	}
	public Stajling(String kreator) {
		super();
		this.kreator = kreator;
	}
	public List<Obuca> getObuca() {
		return obuca;
	}
	public void dodajObuca(Obuca o) {
		obuca.add(o);
	}
	public void izbaciObucu (Obuca o) {
		obuca.remove(o);
	}
	public List<Odeca> getOdeca() {
		return odeca;
	}
	public  void dodajOdecu (Odeca od1) {
		odeca.add(od1);
		
	}
	public void izbaciOdecu(int pozicija) {
		odeca.remove(pozicija);
	}
	public String getKreator() {
		return kreator;
	}
	@Override
	public String toString() {
		char oznakaStajlinga = 0;
		int brojac1 = 0;
		int brojac2 = 0;
		int brojac3 = 0;
		for (int i = 0; i < odeca.size(); i++) {
			if (odeca.get(i).getOznaka() == 'm') {
				brojac1++;
			} else if (odeca.get(i).getOznaka() == 'z') {
				brojac2++;
			} else {
				brojac3++;
			}
		}
		if (brojac1 > brojac2 && brojac1 > brojac3) {
			oznakaStajlinga = 'm';
		} else if (brojac2 > brojac1 && brojac2 > brojac3) {    // nisam ubacio obucu u uslove
			oznakaStajlinga = 'z';
	} else if (brojac1==brojac2||brojac3==odeca.size()-1) {
			oznakaStajlinga = 'u';
	}
		double ukupnaCena = 0;
		for  (int i = 0; i < odeca.size() ; i++) {
			ukupnaCena = ukupnaCena + odeca.get(i).getCena();   // nisam dodao cenu obuce jer sam napravio listu obuce zbog "Moguce je postavit i dohvatiti i izbaciti obucu" 
			
		}
		StringBuilder sb = new StringBuilder();
		sb.append(getKreator());
		sb.append(" ");
		sb.append("-");
		sb.append(" ");
		sb.append(oznakaStajlinga);
		sb.append(" ");
		sb.append("-");
		sb.append(" ");
		sb.append(ukupnaCena);
		return sb.toString();
	}
}