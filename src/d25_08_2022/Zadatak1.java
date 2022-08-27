package d25_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)
		
	    ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
		
		Ispit prvi = new Ispit("Matematika", 8, "Pera Peric");
		Ispit drugi = new Ispit("Srpski", 7, "Jovan Jovanovic");
		Ispit treci = new Ispit("Sociologija", 5, "Ana Simic");
		Ispit cetvrti = new Ispit("Filozofija", 8, "Sanja Peric");
		
		ispiti.add(prvi);
		ispiti.add(drugi);
		ispiti.add(treci);
		ispiti.add(cetvrti);
		
		Student s = new Student(1304, "Jelena Simic", "osnovne", ispiti);
		
		s.print();









	}

}
