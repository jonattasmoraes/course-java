public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println(
                "Detalhes da Pessoa Física - Nome:" + getNome() + ", Endereço: " + getEndereco() + ", CPF: "
                        + getCpf());
    }
}
