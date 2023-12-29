public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes(1, "Cliente A");
        Clientes cliente2 = new Clientes(2, "Cliente B");

        imprimirInformacoesCliente(cliente1);
        imprimirInformacoesCliente(cliente2);
    }

    private static void imprimirInformacoesCliente(Clientes cliente) {
        System.out.println("Dados do cliente");
        System.out.println();
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Tabela: " + cliente.getNomeTabela());
        System.out.println();
    }
}