public abstract class GeradorDeRelatorio {
    protected abstract Relatorio gerarRelatorio();

    public void abrir(){
        Relatorio relatorio = gerarRelatorio();
        relatorio.abrirRelatorio();
    }
}
