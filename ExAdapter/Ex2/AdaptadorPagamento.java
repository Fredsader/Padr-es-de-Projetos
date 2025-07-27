public class AdaptadorPagamento implements PagamentoCartao {
    PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();

    public AdaptadorPagamento(PagamentoBoleto pagamentoBoleto) {
        this.pagamentoBoleto = pagamentoBoleto;
    }

    @Override
    public void pagarCartao() {
        pagamentoBoleto.pagarComBoleto();
    }
    
}
