public class EstudanteFacade {
    private ValidadorDados validador;
    private EmailService email;
    private CartaoEstudante cartao;

    public EstudanteFacade(ValidadorDados validador, EmailService email, CartaoEstudante cartao) {
        this.validador = validador;
        this.email = email;
        this.cartao = cartao;
    }

    public void matricularAluno() {
        validador.validar();
        email.enviarBoasVindas();
        cartao.gerarCartao();
        System.out.println("Aluno matriculado com sucesso!");
    }
}
