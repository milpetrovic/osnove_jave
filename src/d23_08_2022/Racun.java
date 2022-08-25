package d23_08_2022;

public class Racun {
	
	private String brojRacuna;
	private String imePrezime;
	private int stanje;
	
	public Racun() {
		
	}
	
	public Racun(String brojRacuna, String imePrezime, int stanje) {
		super();
		this.brojRacuna = brojRacuna;
		this.imePrezime = imePrezime;
		this.stanje = stanje;
	}
	public String getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public int getStanje() {
		return stanje;
	}
	
	public void menjanjeStanja(int prosledjenaVrednost) {
		this.stanje = this.stanje + prosledjenaVrednost;
	}
	
	public void print() {
		System.out.println(this.imePrezime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je " + this.stanje);
	}
	
	

}
