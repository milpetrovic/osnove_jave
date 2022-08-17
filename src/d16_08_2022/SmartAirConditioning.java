package d16_08_2022;

public class SmartAirConditioning {
	
	public String marka;
    public double temperatura;
    public String mod;
    public double temperaturaNapolju;

    public void stampaj(){
        System.out.println("Marka: " + this.marka + " Temperatura: " +  this.temperatura +
                " Mod: " + this.mod);
    }

    public void proveraTemperatura(double temperaturaNapolju){
        if(temperaturaNapolju > temperatura){
            System.out.println("Temperatura napolju je veca od podesene temperature");
        }else if (temperaturaNapolju < temperatura) {
            System.out.println("Temperatura napolju je manja od podesene temperature");;
        }
    }

}
