package d22_08_2022;

public class Vaga {
	
	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga() {
		
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public double sracunajCenu(int tezina) {
		if(this.mernaJedinica.equals("kg")) {
		return this.proizvod.getCenaKg();
		} else return this.proizvod.getCenaLb();
	}
	
	public void print() {
		System.out.println(this.proizvod.getSifra() + "-" + this.proizvod.getNaziv());
		System.out.println("Cena je: " );
		
	}
	
	

}
