public class Main {
    public static void main(String[] args) {
        PagamentoBoleto pagBoleto = new PagamentoBoleto();
        PagamentoCartao pagCartao = new AdaptadorPagamento(pagBoleto);
    
        pagCartao.pagarCartao();
    }
}
