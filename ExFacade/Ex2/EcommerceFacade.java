public class EcommerceFacade {
    private EstoqueService estoque;
    private FreteService frete;
    private PedidoService pedido;
    private EmailService email;

    public EcommerceFacade(EstoqueService estoque, FreteService frete, PedidoService pedido, EmailService email) {
        this.estoque = estoque;
        this.frete = frete;
        this.pedido = pedido;
        this.email = email;
    }

    public void finalizarCompra() {
        estoque.verificar();
        frete.calcular();
        pedido.registrar();
        email.enviarConfirmacao();
        System.out.println("Compra finalizada com sucesso!");
    }
}
