package klase_2;

public class Event {

	private double vreme;
	private Dvorana dvorana;
	private String tip;
	public Event(double vreme, Dvorana dvorana, String tip) {
		
		this.vreme = vreme;
		this.dvorana = dvorana;
		this.tip = tip;
	}
	public double getVreme() {
		return vreme;
	}
	public void setVreme(double vreme) {
		this.vreme = vreme;
	}
	public Dvorana getDvorana() {
		return dvorana;
	}
	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
}
