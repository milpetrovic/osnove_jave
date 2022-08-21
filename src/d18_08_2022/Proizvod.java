package d18_08_2022;

public class Proizvod {
	
	public String naziv;
	public double cena;
	public double tezina;


	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);
	}
	
	
	public void povecajCenu(int povecanje) {
		this.cena = this.cena + povecanje;
		
	}
	
	public double vratiCenuSaPopustom(double popust) {
		return this.cena - ((this.cena * popust) / 100);
		
	}
	
	
	public int racunajPostarinu() {
		int postarina = 0;
		if(this.tezina < 100){
			 return postarina = 200;
		} else if(this.tezina >=101 && this.tezina <= 500) 	{
			return postarina = 400;
		} else if(this.tezina > 500) {
			return postarina = 1000;
		} return 0;
	}
	

}