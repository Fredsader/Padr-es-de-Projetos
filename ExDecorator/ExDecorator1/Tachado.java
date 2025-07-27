public class Tachado extends FormatoDecorator {

    public Tachado(Texto texto) {
        super(texto);
    }

    @Override
    public String formata() {
        return "<s>" + texto.formata() + "</s>";
    }

    @Override
    public int getTotalCaracteres() {
        return texto.getTotalCaracteres() + 7;
    }
} 