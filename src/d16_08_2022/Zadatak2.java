package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//      Kreirati klasu SmartAirConditioning koja ima:
//      atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//      atribut za izabranu temperaturu
//      atribut za mod (hladi/greje) - string
//      metodu za stampu (proizvoljno)
//      metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.


      SmartAirConditioning s1 = new SmartAirConditioning();
      SmartAirConditioning s2 = new SmartAirConditioning();

      s1.marka = "Samsung";
      s1.temperatura = 20;
      s1.mod = "hladi";
      s1.stampaj();
      s1.proveraTemperatura(30);

      s2.marka = "Vox";
      s2.temperatura = 40;
      s2.mod = "greje";
      s2.stampaj();
      s2.proveraTemperatura(10);

	}

}
