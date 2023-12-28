public class FordSUVCar extends Car {
    public FordSUVCar(String color, String power) {
        super(color, power);
    }

    @Override
    public String getModel() {
        return "Ford Escape";
    }
}