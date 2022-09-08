package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	
	protected String imePrezime;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	
	
	public Radnik() {
		
	}


	public Radnik(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}


	public String getImePrezime() {
		return imePrezime;
	}


	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}


	public ArrayList<Sektor> getSektori() {
		return sektori;
	}
	
	public abstract double vracaPlatu();
		
	
	
	public void zaposliUSektor(Sektor s) {
		this.getSektori().add(s);
		
		
	}
	
	
	
	

}
