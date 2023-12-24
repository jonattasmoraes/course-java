import java.util.Arrays;
import java.util.Scanner;

public class NomesOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");
        String nomesInput = scanner.nextLine();

        String[] nomes = nomesInput.split(",");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes ordenados:");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
