public class Fahrzeug {

    private String modell;
    private int ps;


//Konstruktor
public Fahrzeug(String modell, int ps) {
    this.modell = modell;
    this.ps = ps;
}

public void halloSagen(){
    System.out.println("this car is a "+modell);
    System.out.println("It has "+ps+ " ps" );
}

}