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

    @Override
    public double getPricePerDay() {
       return super.getPricePerDay() * 1.1;
       // ^ 110% of the price per day
    }
}
