import java.util.Scanner;

public class ConversaoTipoWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int valorPrimitivo = scanner.nextInt();

        Double valorWrapper = Double.valueOf(valorPrimitivo);

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);

        scanner.close();
    }
}
