package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.
		
		Autor a = new Autor("Jovan Jovanovic");
		Knjiga k = new Knjiga("123-4", "Riznica", 2015, a);
		
		Autor b = new Autor("Jovan Ducic");
		Knjiga p = new Knjiga("567-8", "Blago cara Radovana", 1976, b);
		
		
		
		k.print();
		
		System.out.println();
		
		p.print();
		


	}

}
