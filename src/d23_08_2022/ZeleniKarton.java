package d23_08_2022;

public class ZeleniKarton {
	
	private String imeStudenta;
	private int brojIndexa;
	private String nazivPredmeta;
	private String imeProfesora;
	private int ocena;
	
	public ZeleniKarton() {
		
	}
	
			
	public ZeleniKarton(String imeStudenta, int brojIndexa, String nazivPredmeta, String imeProfesora, int ocena) {
		super();
		this.imeStudenta = imeStudenta;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.ocena = ocena;
	}
	
	

	public String getImeStudenta() {
		return imeStudenta;
	}


	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}


	public int getBrojIndexa() {
		return brojIndexa;
	}


	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}


	public String getNazivPredmeta() {
		return nazivPredmeta;
	}


	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}


	public String getImeProfesora() {
		return imeProfesora;
	}


	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}


	public int getOcena() {
		return ocena;
	}


	public void setOcena(int ocena) {
		this.ocena = ocena;
	}


	public boolean ispitPolozio() {
		if(this.ocena > 5) {
			return true;
		} else return false;
		}
	
	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeStudenta + "," + this.brojIndexa);
		System.out.println("Profesor: " + this.imeProfesora);
	
	
	
	
	}
	
	
	
	

}
