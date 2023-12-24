public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Detalhes da Pessoa Jurídica - Nome: " + getNome() + ", Endereço: " + getEndereco()
                + ", CNPJ: " + getCnpj());
    }
}
