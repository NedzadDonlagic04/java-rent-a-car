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
        return "Vehicle [regNo= " + this.regNo + ", model= " + this.model + ", year= " + this.year + ", price=" + this.price + "]";
    }

    public double getPricePerDay() {
        return this.price * 24;
    }

    public final double getPricePerMonth() {
        return this.getPricePerDay() * 30;
    }

    public static Vehicle getNewestVehicle(Vehicle ... vehicles) {
        if(vehicles.length == 0) return null;

        Vehicle newest = vehicles[0];

        for(int i=1; i<vehicles.length; i++) {
            if(newest.getYear() < vehicles[i].getYear()) {
                newest = vehicles[i];
            }
        }

        return newest;
    }

    public static void printAllVehiclesWithCargoSpaceGreaterThan(double cargoSpace, Vehicle ... vehicles) {
        System.out.println("Vehicles with cargo space greater than " + cargoSpace + " liters:");
        for(Vehicle vehicle : vehicles) {
            if(vehicle instanceof Car) {
                if(((Car)vehicle).getCargoSpace() > cargoSpace) {
                    System.out.println("\t- " + vehicle.getModel() + ": " + ((Car)vehicle).getCargoSpace());
                }
            } else if(vehicle instanceof CargoVan) {
                if(((CargoVan)vehicle).getMaxLoad() > cargoSpace) {
                    System.out.println("\t- " + vehicle.getModel() + ": " + ((CargoVan)vehicle).getMaxLoad());
                }
            }
        }
    }
}
