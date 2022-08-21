package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
//
//2.Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post
//(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1
		
		FacebookPost f = new FacebookPost();
		FacebookPost p = new FacebookPost();
		
		f.mojeIme = "Milica Petrovic";
		f.tudjeIme = "Petar Petrovic";
		f.tekst = "Srecan rodjendan";
		f.brojLajkova = 50;
		f.brojDeljenja = 10;
		
		p.mojeIme = "Pera Peric";
		p.tudjeIme = "Jovan Jovanovic";
		p.tekst = "Pozdrav";
		p.brojLajkova = 20;
		p.brojDeljenja = 5;
		
		
		f.like();
		
		f.dislike();
		
		f.share();
		
		f.print();
		
		
		
        p.like();
		
		p.dislike();
		
		p.share();
		
		p.print();
		
		
		
		
		
				




	}

}
