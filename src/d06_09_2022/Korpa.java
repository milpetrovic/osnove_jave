package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	
	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}
	
	public void dodajAmbalazu(Ambalaza a) {
		ambalaze.add(a);
	}
	
	public void izbaciAmbalazu(String barKod) {
		for(int i = 0; i < ambalaze.size(); i++) {
			if(ambalaze.get(i).barKod.equals(barKod)) {
				ambalaze.remove(i);
			}
		}
	}
	
	private double cenaSaPopustom(double popust) {
		double suma = 0;
		for(int i = 0; i < ambalaze.size(); i++) {
			suma = suma + ambalaze.get(i).cena();		
		}return suma - popust;
	}
	
	public double ukupnaCena(SuperKartica s) {
		return cenaSaPopustom(s.getPopust());
	}

}
