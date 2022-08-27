package d25_08_2022;

public class Ispit {
	
	private String naziv;
	private int ocena;
	private String profesor;
	
	public Ispit() {
		
	}

	public Ispit(String naziv, int ocena, String profesor) {
		super();
		this.naziv = naziv;
		this.ocena = ocena;
		this.profesor = profesor;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public boolean polozenIspit() {
		if(this.ocena > 5 && this.ocena <= 10) {
			return true;
		} else return false;
	}
	
	public void print() {
		System.out.println(this.naziv + "-" + this.profesor + "-" + this.ocena);
	}

}
