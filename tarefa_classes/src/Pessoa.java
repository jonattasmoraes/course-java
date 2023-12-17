/**
 * @author: Jonattas.Moraes
 */

public class Pessoa {
    // Propriedades
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir uma saudação
    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    // Método principal para a classe Pessoa
    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa1 = new Pessoa("Jonattas", 27);

        // Exibindo uma saudação
        pessoa1.saudacao();
    }
}