package d06_09_2022;

public class Tetrapak extends Ambalaza{
	
	private boolean reciklaza;
	private double osnovnaCena;
	
	


	public Tetrapak() {
		
	}


	public Tetrapak(String barKod, String naziv, double netoTezina, double brutoTezina, boolean reciklaza,
			double osnovnaCena) {
		super(barKod, naziv, netoTezina, brutoTezina);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}



	
	public boolean isReciklaza() {
		return reciklaza;
	}


	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}


	public double getOsnovnaCena() {
		return osnovnaCena;
	}


	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}


	@Override
	public double cena() {
		if(this.reciklaza == true) {
			return tezina() * 1.5 + this.osnovnaCena;
		}  return this.osnovnaCena;
	}
	
	@Override
	public void print() {
		System.out.println(this.barKod + " " + this.naziv + " " + this.netoTezina + " " + this.brutoTezina 
				+ " " + this.reciklaza + " " + this.osnovnaCena);
	}
	
	

	
	
	
	

}
