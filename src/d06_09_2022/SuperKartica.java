package d06_09_2022;

public class SuperKartica {
	
	private int brojKartice;
	private String imePrezime;
	private int popust;
	
	public SuperKartica() {
		
	}

	public SuperKartica(int brojKartice, String imePrezime, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.imePrezime = imePrezime;
		this.popust = popust;
	}

	public int getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void print() {
		System.out.println(this.brojKartice + this.imePrezime);
	}
	
	

}
