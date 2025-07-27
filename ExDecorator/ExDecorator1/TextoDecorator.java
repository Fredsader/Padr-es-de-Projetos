public abstract class TextoDecorator implements Texto {
    protected Texto textoDecorado;

    public TextoDecorator(Texto textoDecorado) {
        this.textoDecorado = textoDecorado;
    }

    @Override
    public String getTexto() {
        return textoDecorado.getTexto();
    }

    @Override
    public int getContagemCaracteres() {
        return textoDecorado.getContagemCaracteres();
    }
} 