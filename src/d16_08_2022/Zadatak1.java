package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		 Napisati klasu Proizvod koja ima atribute
//       naziv proizvoda (String)
//               cenu proizvoda (double)
//       težinu proizvoda u gramima. (double)
//               i metode:
//       stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//       konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//       Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//       Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012


       Proizvod p1 = new Proizvod();
       Proizvod p2 = new Proizvod();

       p1.naziv = "Lampa";
       p1.cena = 5000;
       p1.tezina = 1200;

       p2.naziv = "Sto";
       p2.cena = 10000;
       p2.tezina = 12000;

       p1.stampaj();
       System.out.println(p2.konvertuj("kg"));


       p2.stampaj();
       System.out.println(p2.konvertuj("t"));

	}

}
