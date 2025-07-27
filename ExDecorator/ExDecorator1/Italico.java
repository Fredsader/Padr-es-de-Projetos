public class Italico extends FormatoDecorator {

    public Italico(Texto texto) {
        super(texto);
    }

    @Override
    public String formata() {
        return "<i>" + texto.formata() + "</i>";
    }

    @Override
    public int getTotalCaracteres() {
        return texto.getTotalCaracteres() + 7;
    }
} 