import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> dados = new ArrayList<>();

        while (true) {
            System.out.println(
                    "Digite nome e sexo (Ex.: Amanda, F) e ao terminar digite 'sair' para finalizar a aplicação:");
            String entrada = scanner.nextLine().trim().toLowerCase();

            if (entrada.equalsIgnoreCase("sair")) {
                scanner.close();
                break;
            }

            dados.add(entrada);
        }

        List<String> nomesFemininos = dados.stream()
                .filter(dado -> dado.matches(".*[a-zA-Z]+,\\s*[MFmf]"))
                .filter(dado -> "F".equalsIgnoreCase(dado.split(",")[1].trim()))
                .map(dado -> dado.split(",")[0].trim())
                .collect(Collectors.toList());

        System.out.println("Nomes Femininos:");
        nomesFemininos.forEach(System.out::println);
    }
}
