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
