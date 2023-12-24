public class Pessoas {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A", "123456789", "123.456.789-01");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Av. B", "987654321", "12.345.678/0001-09");

        pessoaFisica.imprimirDetalhes();
        pessoaJuridica.imprimirDetalhes();
    }
}
