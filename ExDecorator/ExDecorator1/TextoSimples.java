public class TextoSimples implements Texto {
    private String texto;

    public TextoSimples(String texto) {
        this.texto = texto;
    }

    @Override
    public String formata() {
        return texto;
    }

    @Override
    public int getTotalCaracteres() {
        return texto.length();
    }
} 