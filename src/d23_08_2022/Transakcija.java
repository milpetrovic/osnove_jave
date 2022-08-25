package d23_08_2022;

public class Transakcija {
	
	private int idTransakcije;
	private Racun prvi;
	private Racun drugi;
	
	public Transakcija() {
		
	}
	
	
	
	public Transakcija(int idTransakcije, Racun prvi, Racun drugi) {
		super();
		this.idTransakcije = idTransakcije;
		this.prvi = prvi;
		this.drugi = drugi;
	}
	
	



	public int getIdTransakcije() {
		return idTransakcije;
	}



	public void setIdTransakcije(int idTransakcije) {
		this.idTransakcije = idTransakcije;
	}



	public Racun getPrvi() {
		return prvi;
	}



	public void setPrvi(Racun prvi) {
		this.prvi = prvi;
	}



	public Racun getDrugi() {
		return drugi;
	}



	public void setDrugi(Racun drugi) {
		this.drugi = drugi;
	}



	private double provizija(int prenosSredstava) {
		
		if(prenosSredstava < 4500) {
			return  45;
		} else return  0.01;
		}
	
	public Double getProvizija(int prenosSredstava) {
		return this.provizija(prenosSredstava);
	}
	
	public void izvrsiTransakciju(int prenosSredstava) {
		this.getPrvi().(this.prvi.getStanje() - (prenosSredstava+ provizija(prenosSredstava)));
		
	
	
	
	}



}
