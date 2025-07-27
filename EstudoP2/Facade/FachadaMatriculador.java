public class FachadaMatriculador {
    private EnviadorEmail enviador;
    private GeradorDeCartao gerador;
    private Validador validador;

    public FachadaMatriculador(EnviadorEmail enviador, GeradorDeCartao gerador, Validador validador){
        this.validador = validador;
        this.enviador = enviador;
        this.gerador = gerador;
    }

    public void matricularAluno(){
        validador.validarDado();
        enviador.enviarEmail();
        gerador.gerarCartao();
    }
}
