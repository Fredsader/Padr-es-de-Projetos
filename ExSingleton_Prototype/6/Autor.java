public class Autor {
    public String nome;
    public String email;

    public Autor() {}

    public Autor(Autor outro) {
        if (outro != null) {
            this.nome = outro.nome;
            this.email = outro.email;
        }
    }
}
