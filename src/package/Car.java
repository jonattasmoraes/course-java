public abstract class Car {
    private String color;
    private String power;

    public Car(String color, String power) {
        this.color = color;
        this.power = power;
    }

    public abstract String getModel();

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }
}