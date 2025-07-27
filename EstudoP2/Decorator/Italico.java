public class Italico extends FormatacaoDecorator{

    public Italico(Texto texto){
        super(texto);
    }

    @Override
    public String getTexto() {
        return "<i>" + texto.getTexto() + "<i>";
    }

}