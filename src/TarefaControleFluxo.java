
/**
 * @author Jonattas Moraes
 */
import java.util.Scanner;

public class TarefaControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em Recuperação.");
        } else {
            System.out.println("Aluno Reprovado.");
        }

        scanner.close();
    }
}
