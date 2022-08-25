package d22_08_2022;

public class Autor {
	
	private String imePrezime;

	
	public Autor() {
		
	}
	
	public Autor(String imePrezime) {
		this.imePrezime = imePrezime;
	}


	public String getImePrezime() {
		return imePrezime;
	}


	public void setImePrezime(String imePrezime) {
		imePrezime = imePrezime;
	}
	
	public void print() {
		System.out.println(this.imePrezime);
	}

}
