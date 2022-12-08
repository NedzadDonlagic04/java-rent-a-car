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
