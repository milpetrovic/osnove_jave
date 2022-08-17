package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//	        JMBG: [jmbg]
//	        Ime: [ime]
//	        Prezime: [prezime]
//	        God. rodjenja: [god]
//	        Aktivan: [true/false]
//	        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

	        int jmbg = 123456;
	        String ime = "Milica";
	        String prezime = "Petrovic";
	        String godRodj = "1986";
	        Boolean aktivan = true;

	        stampaj(jmbg, ime, prezime, godRodj, aktivan);
	    }

	    public static void stampaj(int jmbg, String ime, String prezime, String godRodj,
	                               Boolean aktivan){
	        System.out.println("JMBG: " + jmbg);
	        System.out.println("Ime: " + ime);
	        System.out.println("Prezime: " + prezime);
	        System.out.println("Godina Rodjenja: " + godRodj);
	        System.out.println("Aktivan: " + aktivan);
	}

}
