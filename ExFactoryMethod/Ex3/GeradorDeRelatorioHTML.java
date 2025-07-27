public class GeradorDeRelatorioHTML extends GeradorDeRelatorio {
    @Override
    protected Relatorio gerarRelatorio() {
        return new RelatorioHTML();
    }
}
