// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Car, Van i Limo koje nasljeduje Vehicle. Dodatno, Car sadrzi atribut
carType (String), Van sadrzi atribut height (double) i noOfSeats (int), a Limo sadrzi atribute
length (double) te boolean varijable miniBar i sunRoof. Napravite klase PassengerVan i CargoVan
koje nasljeduje klasu Van, a dodatno imaju privatne atribute noOfPassenger (int, za PassengerVan)
tj. maxLoad (double, u kg, za CargoVan). Napravite get i set metode za svaki atribut svih klasa.
 */
public class Limo extends Vehicle{
    private double length;
    private boolean miniBar;
    private boolean sunRoof;

    public Limo(String regNo, String model, int year, double price, double length, boolean miniBar, boolean sunRoof) {
        super(regNo, model, year, price);

        this.length = length;
        this.miniBar = miniBar;
        this.sunRoof = sunRoof;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public double getLength() {
        return this.length;
    }

    public boolean getMiniBar() {
        return this.miniBar;
    }

    public boolean getSunRoof() {
        return this.sunRoof;
    }
}
