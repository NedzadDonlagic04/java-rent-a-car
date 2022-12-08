public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car("DA1234AA", "Renault Clio", 2001, 20, "coupe");
        Car car = new Car("DA8818BB", "Renault Megane Grandtour", 2007, 25, "caravan");
        Van van1 = new CargoVan("DA0009PO", "Volkswagen Transporter", 2018, 28, 2, (short)3, 4500);
        PassengerVan van2 = new PassengerVan("DA6282EA", "IMV 1600", 1978, 35, 2, (short)3, 0);
        Vehicle limo = new Limo("DA2238AB", "Zastava 750 LE", 1983, 220, 3.2, false, false);

        System.out.println(v);
        System.out.println(car);
        System.out.println(van1);
        System.out.println(van2);
        System.out.println(limo);
    }
}