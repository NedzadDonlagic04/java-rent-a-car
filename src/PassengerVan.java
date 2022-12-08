public class PassengerVan extends Van {
    private int noOfPassenger;

    public PassengerVan(String regNo, String model, int year, double price, double height, int noOfSeats, int noOfPassenger) {
        super(regNo, model, year, price, height, noOfSeats);

        this.noOfPassenger = noOfPassenger;
    }

    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    public int getNoOfPassenger() {
        return this.noOfPassenger;
    }

    @Override
    public double getPricePerDay() {
        return super.getPricePerDay() * 0.8;
        // ^ 80% of the price per day
    }
}
