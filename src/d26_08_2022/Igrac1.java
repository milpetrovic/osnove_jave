package d26_08_2022;

import java.util.ArrayList;

public class Igrac1 extends Osoba1 {
	
	private int brojIgraca;
	private String pozicija;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();
	private boolean kapiten;
	
	public Igrac1() {
		
	}
	
	public Igrac1(String imePrezime, int jmbg, int godinaRodjenja, int brojIgraca, String pozicija,
			ArrayList<Karton> kartoni, boolean kapiten) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.kartoni = kartoni;
		this.kapiten = kapiten;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void dodajKarton(Karton karton) {
		kartoni.add(karton);
	}
	
	public int zutiKarton() {
		int brojac = 0;
		for(int i = 0; i < kartoni.size(); i++) {
			if(kartoni.get(i).getTipKartona().equals("zuti")) {
				brojac++;
			} 
		} return brojac;
	}
		
		public int crveniKarton() {
			int brojac = 0;
			for(int i = 0; i < kartoni.size(); i++) {
				if(kartoni.get(i).getTipKartona().equals("crveni")) {
					brojac++;
				} 
			} return brojac;
	}
		
		public void stampaj() {
			super.stampaj();
			System.out.println("Broj igraca: " + this.brojIgraca);
			System.out.println("Pozicija: " + this.pozicija);
			System.out.println("Broj zutih katrona: " + this.zutiKarton());
			System.out.println("Broj crvenih katrona: " + this.crveniKarton());
			System.out.println("Kapiten: " + this.kapiten);
		}
	
	
		

}
