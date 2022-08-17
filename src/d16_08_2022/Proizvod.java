package d16_08_2022;

public class Proizvod {
	public String naziv;
    public double cena;
    public double tezina;
    public String tipKonverzije;

    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);
    }

    public Double konvertuj(String tipKonverzije){
        if (tipKonverzije == "kg"){
           return  tezina = tezina / 1000;
        }else if (tipKonverzije == "t"){
            return tezina = tezina / 1000000;
        }
        return 0.00;
    }

}
