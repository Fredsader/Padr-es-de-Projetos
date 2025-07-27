public class PagamentoPix implements Pagamento {
    public String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de:"+valor+" vindo da chave pix:" +chavePix+" recebido");
    }
}
