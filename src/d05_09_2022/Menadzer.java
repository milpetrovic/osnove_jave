package d05_09_2022;

public class Menadzer extends Radnik {
	
	
	
	public Menadzer() {
		super();
		
	}

	public Menadzer(String imePrezime) {
		super(imePrezime);
		
	}
	
	
	@Override
	public double vracaPlatu() {
		double suma = 0;
		for(int i = 0; i < sektori.size(); i++) {
			suma = suma + sektori.get(i).getPlata();
			
		} return suma;
	}
	
	

}
