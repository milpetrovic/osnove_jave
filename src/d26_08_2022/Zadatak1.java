package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	
		
//		1.Zadatak
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		
		

//
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
//		na kraju programa ispisati sve igrace i trenere. 
//		Podatke za igrace i trenere unosi korisnik sa tastature.
		
		
//		
//		Igrac prvi = new Igrac("Petar Peric", 123456, 1997, 5, "odbrambeni", true);
//		Igrac drugi = new Igrac("Jovan Ilic", 546373, 1994, 8, "napadac", false);
//		
//		prvi.stampaj();
//		drugi.stampaj();
//		
//		Trener jedan = new Trener("Zika Savic", 8383738, 1975, 10, "kondicioni");
//		Trener dva = new Trener("Sasa Mitic", 3837363, 1978, 20, "pomocni");	
//		
//		jedan.stampaj();
//		dva.stampaj();
		
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj igraca: ");
		int broj = s.nextInt();
		
		for(int i = 0; i < broj; i++) {
			Igrac noviIgrac = new Igrac();
			System.out.println("Unesite ime igraca: ");
			noviIgrac.setImePrezime(s.next());
			System.out.println("Unesite jmbg igraca: ");
			noviIgrac.setJmbg(s.nextInt());
			System.out.println("Unesite godinu rodjenja igraca: ");
			noviIgrac.setGodinaRodjenja(s.nextInt());
			System.out.println("Unesite broj igraca: ");
			noviIgrac.setBroj(s.nextInt());
			System.out.println("Unesite unesite poziciju igraca: ");
			noviIgrac.setPozicija(s.next());
			System.out.println("Unesite da li je igrac kapiten: ");
			noviIgrac.setKapiten(s.nextBoolean());
			igraci.add(noviIgrac);
			

		}
		
		for(int i = 0; i < igraci.size(); i ++) {
			igraci.get(i).stampaj();
		}



	}

}
