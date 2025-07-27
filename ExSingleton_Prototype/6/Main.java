public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor();
        a1.nome = "Joao";
        a1.email = "joao@email.com";

        Documento d1 = new Documento();
        d1.titulo = "Relatorio";
        d1.autor = a1;

        Documento d2 = d1.clonar();
        d2.autor.nome = "Maria";
        d2.autor.email = "maria@email.com";

        d1.exibir();
        d2.exibir();
    }
}
