public class Main {
   public static void main(String[] args) {
    EnviadorEmail enviador = new EnviadorEmail();
    GeradorDeCartao gerador = new GeradorDeCartao();
    Validador validador = new Validador();
    FachadaMatriculador fachada = new FachadaMatriculador(enviador, gerador, validador);

    fachada.matricularAluno();
   }
}
