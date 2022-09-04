package MiniProjekat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
//
//Kreirati klasu Player koja ima:
//ime i prezime
//gettere i settere
//konstuktore
//metodu print, koja stampa ime i prezime igraca
//
//Kreirati klasu XandOGame koja ima:
//table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//playerX - igrac X
//playerO - igrac O
//Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je � �
//Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve 
//sto radi i difoltni samo sto dodatno postavlja i igraca
//gettere i settere za igrace
//Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. 
//Ako je niz iz primera iznad stampa izgleda:
//x | x | 0 |
//0 | x | 0 |
//x | 0 | x |
//
//Metodu startGame, metoda postavlja sve elemente niza na prazan string � �
//i zatim postavlja da je na redu igrac X.
//Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. 
//Metoda od parametara prima niz i poziciju za kojju se proverava. 
//Polje je slobodno ako u njemu ne pise x ili o
//Metodu playNext, metoda prebacuje potez na sledeceg igraca, 
//ako je bio igrac x prebacuje ga na o i obrnuto
//Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//Ako je trenutno stanje u igri i sledeci na redu je igrac x
//x | x | 0 |
//0 |   |   |
//x |   |   |
//I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//x | x | 0 |
//0 |   | x |
//x |   |   |
//Metodu isWinnerX - metoda vraca rezultat igre za igraca X. 
//Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka 
//ili po koloni ili po redu ili po dijgonalama
//Metodu isWinnerO -  metoda vraca rezultat igre za igraca O.
//Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka 
//ili po koloni ili po redu ili po dijgonalama
//Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna.
//		Pozicija je validna ako je u opsegu od 0 do 8
//Metodu gameScore, metoda vraca informaciju za kraj igre.
//Ukoliko je pobednik igrac x, metoda vraca 1
//Ukoliko je pobednik igrac o, metoda vraca 2
//Ukoliko nemam pobednika vracamo 0
//
//
//Glavni program (main):
//Ucitati podatke za igrace
//Kreirajte objekat klase XandOGame 
//Startujte igru, tada je na potezu igrac X
//Saveti za dobar zadatak
//Igra treba da traje dok (while petlja)
//nije kraj igre - imamo metodu za to
//Ili dok ne dobijemo pobednika
//U petlji
//Trazimo od aktuelnog igraca da unese potez
//Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//Prebacujemo red na drugog igraca
//Stampamo tablu
//Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace
		
		
		Player x = new Player("Pera Peric");
		Player o = new Player("Joca Jocic");
		
		XandOGame game = new XandOGame(x, o);
		
		Scanner s = new Scanner(System.in);
		
		game.startGame();
		
		
		while(!game.isGameOver()) {
			System.out.println("Unesite poziciju od 0 do 8: ");
			int pozicija = s.nextInt();
			if(game.isValidMove(pozicija) && game.isFieldFree(game.getTable(), pozicija)) {
				game.makeAMove(pozicija);
				game.playNext();
				game.print();
				System.out.println();
				if(game.isWinnerX()) 
					break;
				else if(game.isWinnerO())
					break;
				
			} else System.out.println("You enter invalid position");
		} if(game.gameScore() == 1) {
			System.out.println("Pobednik je igrac X");
		} else if(game.gameScore() == 2) {
			System.out.println("Pobednik je igrac O");
		} else System.out.println("Igra je neresena");
		
		
	}
		
		
		
		
		
		
		
		          

		
	}	


	


