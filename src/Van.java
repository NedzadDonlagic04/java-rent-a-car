// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Car, Van i Limo koje nasljeduje Vehicle. Dodatno, Car sadrzi atribut
carType (String), Van sadrzi atribut height (double) i noOfSeats (int), a Limo sadrzi atribute
length (double) te boolean varijable miniBar i sunRoof. Napravite klase PassengerVan i CargoVan
koje nasljeduje klasu Van, a dodatno imaju privatne atribute noOfPassenger (int, za PassengerVan)
tj. maxLoad (double, u kg, za CargoVan). Napravite get i set metode za svaki atribut svih klasa.
 */
public class Van extends Vehicle {
    private double height;
    private int noOfSeats;

    public Van(String regNo, String model, int year, double price, double height, int noOfSeats) {
        super(regNo, model, year, price);

        this.height = height;
        this.noOfSeats = noOfSeats;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getHeight() {
        return this.height;
    }

    public int getNoOfSeats() {
        return this.noOfSeats;
    }
}
