public class PagamentoBoleto implements Pagamento{
    public String codigo;

    public PagamentoBoleto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void  processarPagamento(double valor){
        System.out.println("Boleto de número:"+ codigo + " pago");
        System.out.println("valor:"+ valor);
    }
}
