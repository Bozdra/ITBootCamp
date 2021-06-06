package klase_2;

public class Dvorana {
	
	private String ime;
	private String grad;
	private int kapacitet;
	
	public Dvorana(String ime, String grad, int kapacitet) {
		
		this.ime = ime;
		this.grad = grad;
		this.kapacitet = kapacitet;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getGrad() {
		return grad;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	
	
}
