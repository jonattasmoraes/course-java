import java.util.ArrayList;
import java.util.List;

public class ListaCarrosGenerica {
    public static void main(String[] args) {
        List<Object> listaCarros = new ArrayList<>();

        listaCarros.add(new FordCar("Focus"));
        listaCarros.add(new PeugeotCar(305));
        listaCarros.add(new FordCar("Ranger"));
        listaCarros.add(new PeugeotCar(2008));

        for (Object carro : listaCarros) {
            if (carro instanceof FordCar) {
                System.out.println("Modelo: Ford " + ((FordCar) carro).getModelo());
                System.out.println();
            } else if (carro instanceof PeugeotCar) {
                System.out.println("Modelo: Peugeot " + ((PeugeotCar) carro).getModelo());
                System.out.println();
            }
        }
    }
}
