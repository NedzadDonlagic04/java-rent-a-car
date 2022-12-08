// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Car, Van i Limo koje nasljeduje Vehicle. Dodatno, Car sadrzi atribut
carType (String), Van sadrzi atribut height (double) i noOfSeats (int), a Limo sadrzi atribute
length (double) te boolean varijable miniBar i sunRoof. Napravite klase PassengerVan i CargoVan
koje nasljeduje klasu Van, a dodatno imaju privatne atribute noOfPassenger (int, za PassengerVan)
tj. maxLoad (double, u kg, za CargoVan). Napravite get i set metode za svaki atribut svih klasa.
 */
public class Car extends Vehicle {
    private String carType;

    public Car(String regNo, String model, int year, double price, String carType) {
        super(regNo, model, year, price);

        this.carType = carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return this.carType;
    }
}
