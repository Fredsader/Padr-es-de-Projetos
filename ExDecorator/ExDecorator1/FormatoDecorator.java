public abstract class FormatoDecorator implements Texto {
    protected Texto texto;

    public FormatoDecorator(Texto texto) {
        this.texto = texto;
    }
} 