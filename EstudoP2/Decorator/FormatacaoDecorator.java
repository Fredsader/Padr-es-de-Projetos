public abstract class FormatacaoDecorator implements Texto {
    protected Texto texto;

    public FormatacaoDecorator(Texto texto){
        this.texto = texto;
    }
}
