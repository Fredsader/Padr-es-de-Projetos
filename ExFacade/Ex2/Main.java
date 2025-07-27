public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        EstoqueService estoque = new EstoqueService();
        FreteService frete = new FreteService();
        PedidoService pedido = new PedidoService();
        EmailService email = new EmailService();

        // Criando a fachada
        EcommerceFacade ecommerce = new EcommerceFacade(estoque, frete, pedido, email);

        // Usando a fachada
        ecommerce.finalizarCompra();
    }
}
