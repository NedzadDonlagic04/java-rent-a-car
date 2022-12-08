// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Car, Van i Limo koje nasljeduje Vehicle. Dodatno, Car sadrzi atribut
carType (String), Van sadrzi atribut height (double) i noOfSeats (int), a Limo sadrzi atribute
length (double) te boolean varijable miniBar i sunRoof. Napravite klase PassengerVan i CargoVan
koje nasljeduje klasu Van, a dodatno imaju privatne atribute noOfPassenger (int, za PassengerVan)
tj. maxLoad (double, u kg, za CargoVan). Napravite get i set metode za svaki atribut svih klasa.
 */
public class CargoVan extends Van {
    private double maxLoad;

    public CargoVan(String regNo, String model, int year, double price, double height, int noOfSeats, double maxLoad) {
        super(regNo, model, year, price, height, noOfSeats);

        this.maxLoad = maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }
}
