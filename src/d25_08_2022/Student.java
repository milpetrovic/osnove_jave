package d25_08_2022;

import java.util.ArrayList;

public class Student {
	
	private int brojIndexa;
	private String imePrezime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public Student() {
		
	}

	public Student(int brojIndexa, String imePrezime, String tipStudija, ArrayList<Ispit> ispiti) {
		super();
		this.brojIndexa = brojIndexa;
		this.imePrezime = imePrezime;
		this.tipStudija = tipStudija;
		this.ispiti = ispiti;
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	
	public ArrayList<Ispit> getIspiti() {
		return this.ispiti;
	}
	
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
		
	}
	
	public double prosek() {
		int suma = 0;
		int brojOcena = 0;
		for(int i = 0; i < this.ispiti.size(); i++) {
			if(this.ispiti.get(i).getOcena() > 5) {
			suma = suma + this.ispiti.get(i).getOcena();
			brojOcena++;
			} 
		} return suma/brojOcena;
	}
	
	public void print() {
		System.out.println(this.brojIndexa + " - " + this.imePrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for(int i = 0; i < this.ispiti.size(); i++) {
			System.out.println(this.ispiti.get(i).getNaziv()  + "-" +  this.ispiti.get(i).getProfesor()
					+ "-" +  this.ispiti.get(i).getOcena());
		}System.out.println("Prosecna ocena: " + prosek());
		
	}
	
	

}
