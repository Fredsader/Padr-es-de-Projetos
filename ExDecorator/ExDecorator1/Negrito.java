public class Negrito extends FormatoDecorator {

    public Negrito(Texto texto) {
        super(texto);
    }

    @Override
    public String formata() {
        return "<b>" + texto.formata() + "</b>";
    }

    @Override
    public int getTotalCaracteres() {
        return texto.getTotalCaracteres() + 7;
    }
} 