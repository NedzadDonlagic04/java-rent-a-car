public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car("DA1234AA", "Renault Clio", 2001, 20, "coupe");
        Car car = new Car("DA8818BB", "Renault Megane Grandtour", 2007, 25, "caravan");

        System.out.println(v);
        System.out.println(car);
    }
}