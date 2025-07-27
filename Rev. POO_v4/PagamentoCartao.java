public class PagamentoCartao implements Pagamento{
    public int tipo;

    public PagamentoCartao(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void processarPagamento(double valor){
        if (tipo == 1){
            System.out.println("Valor de:"+ valor +" creditado na conta");
        } else if (tipo == 2){
            System.out.println("Pagamento de:" + valor + "recebido");
        }
    }
}
