package klase;

public class Geography {

	public static void main(String[] args) {
		Kontinent evropa = new Kontinent("Evropa", "Beli");
		Kontinent azija = new Kontinent("Azija", "Zuti");
		Drzava srbija = new Drzava("Srbija", "Boze pravde", evropa);
		Drzava madjarska = new Drzava("Madjarska", "Boze blagoslovi Madjare", evropa);
		Drzava kina = new Drzava("Kina", "Canaan", azija);
		Grad beograd = new Grad("Beograd", 117, 1374000, srbija);
		Grad peking = new Grad("Peking", 150, 5000000, kina);

		srbija.setKontinent(evropa);
		madjarska.setKontinent(evropa);
		beograd.setDrzava(madjarska);
		System.out.println(beograd.getDrzava().getIme());
		System.out.println(beograd.getDrzava().getKontinent().getRasa());
		beograd.setDrzava(srbija);
		System.out.println(beograd.getDrzava().getIme());
		evropa.setRasa("Crni");
		System.out.println(beograd.getDrzava().getKontinent().getRasa());
		srbija.setHimna("Hej Sloveni");
		System.out.println(beograd.getDrzava().getHimna());
		azija.setRasa("Beli");
		kina.setKontinent(evropa);
		peking.setDrzava(madjarska);
		System.out.println(peking.getDrzava().getKontinent().getIme());
		srbija.setKontinent(azija);
		System.out.println(beograd.getDrzava().getKontinent().getRasa());

	}

}
