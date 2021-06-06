package klaseNasledjivanje;

public class Ribe extends Zivotinje {
	private String voda;
	private String peraja;
	public Ribe(String vrsta, String naziv, String voda, String peraja) {
		super(vrsta, naziv);
		this.voda = voda;
		this.peraja = peraja;
	}
	public Ribe(String vrsta, String naziv) {
		super(vrsta, naziv);
	}
	public String getVoda() {
		return voda;
	}
	public void setVoda(String voda) {
		this.voda = voda;
	}
	public String getPeraja() {
		return peraja;
	}
	public void setPeraja(String peraja) {
		this.peraja = peraja;
	}
	

}
