public class Sublinhado extends FormatacaoDecorator{

    public Sublinhado(Texto texto){
        super(texto);
    }

    @Override
    public String getTexto() {
        return "<u>" + texto.getTexto() + "<u>";
    }

}