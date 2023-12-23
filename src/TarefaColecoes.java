
/**
 * Tarefa de coleções
 * @author Jonattas Moraes
 **/

import java.util.Scanner;

public class TarefaColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, sexo;
        String masculinos = "";
        String femininos = "";

        while (true) {
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.next();

            scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculinos += nome + "\n";
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos += nome + "\n";
            } else {
                System.out.println("Sexo inválido. Por favor, digite M ou F.");
            }
        }

        System.out.println("\nNomes Masculinos:\n" + masculinos);
        System.out.println("Nomes Femininos:\n" + femininos);

        scanner.close();
    }
}
