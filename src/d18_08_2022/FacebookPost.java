package d18_08_2022;

public class FacebookPost {
	
	public String mojeIme;
	public String tudjeIme;
	public String tekst;
	public int brojLajkova;
	public int brojDeljenja;
	
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
	
	
				
	
			
	

}
