package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		
//		Zadatak
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		
		ZeleniKarton z = new ZeleniKarton();
		
		ArrayList<ZeleniKarton> niz = new ArrayList<ZeleniKarton>();
		
//		for(int i = 0; i < 10; i++) {
//		niz.add(new ZeleniKarton());
//		}
		
		niz.add(new ZeleniKarton("aa aa", 1111, "Matematika",
				"Zoki Zokic", 6));
		niz.add(new ZeleniKarton("aa aa", 2222, "Elektronika",
				"Pera Peric", 5));
		niz.add(new ZeleniKarton("aa aa", 3333, "Ekonomija",
				"Srdjan Srdjic", 9));
		niz.add(new ZeleniKarton("aa aa", 4444, "Fizika",
				"Milica Petrovic", 1));
		niz.add(new ZeleniKarton("aa aa", 5555, "Fizicko",
				"Marko Markovic", 6));
		niz.add(new ZeleniKarton("aa aa", 6666, "Biologija",
				"Petar Petrovic", 7));
		niz.add(new ZeleniKarton("aa aa", 7777, "Filozofija",
				"Jovan Jovanovic", 10));
		niz.add(new ZeleniKarton("aa aa", 8888, "Hemija",
				"Boki Bokic", 7));
		niz.add(new ZeleniKarton("aa aa", 9999, "Srpski",
				"Milan Milic", 4));
		niz.add(new ZeleniKarton("aa aa", 1000, "Sociologija",
				"Kraj Krajevic", 5));
		
		
		for(int i = 0; i < niz.size(); i++) {
			niz.get(i).print();
		}
		


	}

}
