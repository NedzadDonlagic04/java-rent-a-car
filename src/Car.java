public class Car extends Vehicle {
    private String carType;
    private double cargoSpace;

    public Car(String regNo, String model, int year, double price, String carType, double cargoSpace) {
        super(regNo, model, year, price);

        this.carType = carType;
        this.cargoSpace = cargoSpace;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCargoSpace(double cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public String getCarType() {
        return this.carType;
    }

    public double getCargoSpace() {
        return this.cargoSpace;
    }
}
