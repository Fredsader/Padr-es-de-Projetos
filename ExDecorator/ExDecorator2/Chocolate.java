public class Chocolate extends BebidaDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }
} 