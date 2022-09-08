package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {
	
	private double kaucija;
	private boolean imaKaucija;
	private double cenaAmbalaze;
	
	
	
	

	public StaklenaAmbalaza() {
		
	}

	public StaklenaAmbalaza(String barKod, String naziv, double netoTezina, 
			double brutoTezina, double kaucija, boolean imaKaucija, double cenaAmbalaze) {
		super(barKod, naziv, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.imaKaucija = imaKaucija;
		this.cenaAmbalaze = cenaAmbalaze;
	}
	
	

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isImaKaucija() {
		return imaKaucija;
	}

	public void setImaKaucija(boolean imaKaucija) {
		this.imaKaucija = imaKaucija;
	}

	public double getCenaAmbalaze() {
		return cenaAmbalaze;
	}

	public void setCenaAmbalaze(double cenaAmbalaze) {
		this.cenaAmbalaze = cenaAmbalaze;
	}

	@Override
	public double cena( ) {
		if(this.imaKaucija == true) {
			return this.cenaAmbalaze * 1.2 + this.kaucija;
		} else return this.cenaAmbalaze * 1.2;
	}
	
	@Override
	public void print()	{
		System.out.println(this.barKod + " " + this.naziv + " " + this.netoTezina + " " + this.brutoTezina 
				+ " " + this.kaucija + " " + this.imaKaucija + " " + this.cenaAmbalaze);
		
	}
	
	
	

}
