public class GeradorDeRelatorioPDF extends GeradorDeRelatorio {
    @Override
    protected Relatorio gerarRelatorio() {
        return new RelatorioPDF();
    }

}
