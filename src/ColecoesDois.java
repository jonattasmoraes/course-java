import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ColecoesDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> nomesPorGenero = new HashMap<>();

        while (true) {
            System.out.print("Digite o nome e sexo separados por '-' (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                nomesPorGenero.put(nome, sexo);
            } else {
                System.out.println("Entrada inválida. Digite o nome e sexo separados por '-'.");
            }
        }

        exibirNomesPorGenero(nomesPorGenero, "M", "Masculinos");
        exibirNomesPorGenero(nomesPorGenero, "F", "Femininos");

        scanner.close();
    }

    private static void exibirNomesPorGenero(Map<String, String> nomesPorGenero, String genero, String mensagem) {
        System.out.println("\n" + mensagem + ":");
        nomesPorGenero.forEach((nome, sexo) -> {
            if (sexo.equalsIgnoreCase(genero)) {
                System.out.println(nome);
            }
        });
    }
}
