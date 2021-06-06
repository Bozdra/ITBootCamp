package klaseNasledjivanje;

public class Sisari extends Zivotinje {
	private String bojaDlake;
	private int brojNogu;
	public Sisari(String vrsta, String naziv, String bojaDlake, int brojNogu) {
		super(vrsta, naziv);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}
	public String getBojaDlake() {
		return bojaDlake;
	}
	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	public int getBrojNogu() {
		return brojNogu;
	}
	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
	}
}
	
