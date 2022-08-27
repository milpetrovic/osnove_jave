package d26_08_2022;

public class Trener extends Osoba {
	
	
	
	private int godineIskustva;
	private String tipTrenera;
	
	public Trener() { 
		
	}
	
	
	
	public Trener(String imePrezime, int jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}



	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godineIskustva);
		System.out.println("Tip trenera: " + this.tipTrenera);
	}

}
