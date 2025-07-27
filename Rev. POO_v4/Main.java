public class Main {
    public static void main(String[] args) {
    
        Pagamento boleto = new PagamentoBoleto("1234-56789-0001");
        Pagamento cartao = new PagamentoCartao(1);
        Pagamento pix = new PagamentoPix("192.177.917-92");

        boleto.processarPagamento(20);
        cartao.processarPagamento(20);
        pix.processarPagamento(20);
    }
}
