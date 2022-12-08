public class Vehicle {
    private String regNo;
    private String model;
    private int year;
    private double price;

    public Vehicle(String regNo, String model, int year, double price) {
        this.regNo = regNo;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegNo() {
        return this.regNo;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "regNo= " + this.regNo + ", model= " + this.model + ", year= " + this.year + ", price=" + this.price;
    }
}
