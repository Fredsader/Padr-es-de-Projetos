public class Retangulo extends Forma {
    public int largura;
    public int altura;

    public Retangulo() {}

    protected Retangulo(Retangulo outro) {
        super(outro);
        if (outro != null) {
            this.largura = outro.largura;
            this.altura = outro.altura;
        }
    }

    @Override
    public Forma clonar() {
        return new Retangulo(this);
    }
}
