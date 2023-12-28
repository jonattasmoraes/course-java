import java.util.HashMap;
import java.util.Map;

public class FordCarFactory implements CarFactory {
    private Map<String, Car> cars;

    public FordCarFactory() {
        this.cars = new HashMap<>();
        initializeCars();
    }

    private void initializeCars() {
        cars.put("compact", new FordCompactCar("defaultColor", "defaultPower"));
        cars.put("sedan", new FordSedanCar("defaultColor", "defaultPower"));
        cars.put("suv", new FordSUVCar("defaultColor", "defaultPower"));
    }

    @Override
    public Car createCar(String model, String color, String power) {
        Car baseCar = cars.get(model.toLowerCase());
        if (baseCar != null) {
            return new Car(color, power) {
                @Override
                public String getModel() {
                    return baseCar.getModel();
                }
            };
        }
        return null;
    }
}