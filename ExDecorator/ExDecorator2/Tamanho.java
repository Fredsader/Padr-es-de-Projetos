public class Tamanho extends BebidaDecorator {
    public enum TamanhoCafe {
        PEQUENO(0.0),
        MEDIO(1.0),
        GRANDE(2.0);

        private final double precoAdicional;

        TamanhoCafe(double precoAdicional) {
            this.precoAdicional = precoAdicional;
        }
    }

    private TamanhoCafe tamanho;

    public Tamanho(Bebida bebida, TamanhoCafe tamanho) {
        super(bebida);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " (" + tamanho.name().toLowerCase() + ")";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + tamanho.precoAdicional;
    }
} 