package d19_08_2022;

public class FacebookPost {
	
	public String mojeIme;
	public String tudjeIme;
	public String tekst;
	public int brojLajkova;
	public int brojDeljenja;
	
	public FacebookPost() {
		
	}
	
	public FacebookPost(String mojeIme, String tudjeIme, String tekst) {
		this.mojeIme = mojeIme;
		this.tudjeIme = tudjeIme;
		this.tekst = tekst;
	}
	
	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}
	
	public void dislike() {
		if(this.brojLajkova > 0) {
			this.brojLajkova = this.brojLajkova - 1;
		}
	}
	
	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
		
	}
	
	public void print() {
		System.out.println(this.mojeIme + ">>>" + this.tudjeIme);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
	}

	public String getMojeIme() {
		return mojeIme;
	}

	public void setMojeIme(String mojeIme) {
		this.mojeIme = mojeIme;
	}

	public String getTudjeIme() {
		return tudjeIme;
	}

	public void setTudjeIme(String tudjeIme) {
		this.tudjeIme = tudjeIme;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getBrojLajkova() {
		return brojLajkova;
	}

	public void setBrojLajkova(int brojLajkova) {
		this.brojLajkova = brojLajkova;
	}

	public int getBrojDeljenja() {
		return brojDeljenja;
	}

	public void setBrojDeljenja(int brojDeljenja) {
		this.brojDeljenja = brojDeljenja;
	}
	
	
	
	
	
	
	

}
