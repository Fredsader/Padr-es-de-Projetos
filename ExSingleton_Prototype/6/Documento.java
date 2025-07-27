public class Documento {
    public String titulo;
    public Autor autor;

    public Documento() {}

    public Documento(Documento outro) {
        if (outro != null) {
            this.titulo = outro.titulo;
            this.autor = new Autor(outro.autor);
        }
    }

    public Documento clonar() {
        return new Documento(this);
    }

    public void exibir() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor.nome + ", Email: " + autor.email);
    }
}
