public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        PainelGerente gerente = new PainelGerente();
        PainelLogistica logistica = new PainelLogistica();

        estoque.registerObserver(gerente);
        estoque.registerObserver(logistica);

        estoque.atualizaçãoEstoque(3);
        estoque.atualizaçãoEstoque(2);
    }
}
