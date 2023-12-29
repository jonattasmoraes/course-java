@Tabela(nome = "distribuidor")
class Clientes {
    private int id;
    private String nome;

    public Clientes(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeTabela() {
        Tabela tabela = getClass().getAnnotation(Tabela.class);
        return tabela.nome();
    }
}