public class Adaptador implements ArquivoCsv{
    private final ArquivoTxt arquivo;

    public Adaptador(ArquivoTxt arquivo){
        this.arquivo = arquivo;
    }

    @Override
    public void abrir() {
        arquivo.ler();
    }
}
