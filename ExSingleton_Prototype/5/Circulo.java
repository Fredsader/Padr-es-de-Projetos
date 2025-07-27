public class Circulo extends Forma {
    public int raio;

    public Circulo() {}

    protected Circulo(Circulo outro) {
        super(outro);
        if (outro != null) {
            this.raio = outro.raio;
        }
    }

    @Override
    public Forma clonar() {
        return new Circulo(this);
    }
}
