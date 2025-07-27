public class Main {
    public static void main(String[] args) {
        ValidadorDados validador = new ValidadorDados();
        EmailService email = new EmailService();
        CartaoEstudante cartao = new CartaoEstudante();

        EstudanteFacade estudante = new EstudanteFacade(validador, email, cartao);

        estudante.matricularAluno();
    }
}
