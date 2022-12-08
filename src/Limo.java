public class Limo extends Vehicle{
    private double length;
    private boolean miniBar;
    private boolean sunRoof;

    public Limo(String regNo, String model, int year, double price, double length, boolean miniBar, boolean sunRoof) {
        super(regNo, model, year, price);

        this.length = length;
        this.miniBar = miniBar;
        this.sunRoof = sunRoof;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public double getLength() {
        return this.length;
    }

    public boolean getMiniBar() {
        return this.miniBar;
    }

    public boolean getSunRoof() {
        return this.sunRoof;
    }
}
