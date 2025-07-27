public class Sublinhado extends FormatoDecorator {

    public Sublinhado(Texto texto) {
        super(texto);
    }

    @Override
    public String formata() {
        return "<u>" + texto.formata() + "</u>";
    }

    @Override
    public int getTotalCaracteres() {
        return texto.getTotalCaracteres() + 7;
    }
} 