public class Canela extends BebidaDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com canela";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.75;
    }
} 