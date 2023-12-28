public class FordSedanCar extends Car {
    public FordSedanCar(String color, String power) {
        super(color, power);
    }

    @Override
    public String getModel() {
        return "Ford Fusion";
    }
}