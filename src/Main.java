public class Main {
    public static void main(String[] args) {
        Class<?> classe = ClasseAnotation.class;
        Tabela tabela = classe.getAnnotation(Tabela.class);
        System.out.println("Nome da Tabela: " + tabela.nome());
    }
}
