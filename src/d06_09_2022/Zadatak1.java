package d06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		
//		1.Zadatak
//		Kreirati abstraktnu klasu Ambalaza koja ima:
//		barkod (primer: 328232-2823)
//		naziv artikla
//		neto tezinu
//		bruto tezinu
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere
//		metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//		abstraktnu metodu koja vraca cenu artikla
//		abstraktnu metodu stampaj
//
//		Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.
//
//		Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//		Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, � )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
//
//
//
//
//
//
//		Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar 
//		funkcije se prima Super karticu iz koje se cita popust.
//
//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza
//		razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
		
		SuperKartica superKartica = new SuperKartica(123456789, "Milica Petrovic", 200);
		Korpa k = new Korpa();
		
		k.dodajAmbalazu(new Tetrapak("33566-37833", "mleko", 100.0, 150.0, true, 300));
		k.dodajAmbalazu(new StaklenaAmbalaza("5555-5555", "sok", 150.0, 200.0, 25, true, 450));
		k.dodajAmbalazu(new Tetrapak("33566-37833", "jogurt", 100.0, 150.0, false, 300));
		k.dodajAmbalazu(new StaklenaAmbalaza("5555-5555", "pivo", 150.0, 200.0, 25, false, 150));
		
		k.izbaciAmbalazu("33566-37833");
		
		
		
		System.out.println("Ukupna cena je: " + k.ukupnaCena(superKartica));

	}

}
