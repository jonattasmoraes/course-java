public class Demo {
    public static void main(String[] args) {
        CarFactory fordFactory = new FordCarFactory();

        Car fordCompact = fordFactory.createCar("compact", "Azul", "110hp");
        Car fordSedan = fordFactory.createCar("sedan", "Vermelho", "150hp");
        Car fordSUV = fordFactory.createCar("SUV", "Preto", "200hp");

        printCarDetails(fordCompact);
        printCarDetails(fordSedan);
        printCarDetails(fordSUV);
    }

    private static void printCarDetails(Car car) {
        if (car != null) {
            System.out.println("Modelo: " + car.getModel());
            System.out.println("Cor: " + car.getColor());
            System.out.println("Potência: " + car.getPower());
            System.out.println();
        } else {
            System.out.println("Modelo não reconhecido pela fábrica.");
        }
    }
}
