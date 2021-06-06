package drugiZadatak;

public class Putnik {
	StringBuilder sb = new StringBuilder();
	private String ime;
	protected double kilaza;
	
	@Override
	public String toString() {
		sb.append(ime);
		sb.append("[" + kilaza + "]");
		String a = sb.toString();
		return a;
		
	}
	public Putnik(String ime, double kilaza) {
		super();
		this.ime = ime;
		this.kilaza = kilaza;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public double getKilaza() {
		return kilaza;
	}
	public void setKilaza(double kilaza) {
		this.kilaza = kilaza;
	}
}
