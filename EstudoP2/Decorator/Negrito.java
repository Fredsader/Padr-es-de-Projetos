public class Negrito extends FormatacaoDecorator{

    public Negrito(Texto texto){
        super(texto);
    }

    @Override
    public String getTexto() {
        return "<b>" + texto.getTexto() + "<b>";
    }

}
