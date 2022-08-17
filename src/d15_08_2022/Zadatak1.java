package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		
		int vrednost = stampajVrednostZa10Vecu(10);
		System.out.println(vrednost);


	}
	
	public static int stampajVrednostZa10Vecu (int x) {
		return x + 10;
	}

}
