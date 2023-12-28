public class FordCompactCar extends Car {
    public FordCompactCar(String color, String power) {
        super(color, power);
    }

    @Override
    public String getModel() {
        return "Ford Focus";
    }
}