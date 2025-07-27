public abstract class Forma {
    public int x;
    public int y;
    public String cor;

    public Forma() {}

    protected Forma(Forma outra) {
        if (outra != null) {
            this.x = outra.x;
            this.y = outra.y;
            this.cor = outra.cor;
        }
    }

    public abstract Forma clonar();

    public void exibirInfo() {
        System.out.println(this.getClass().getSimpleName() + 
            " [x=" + x + ", y=" + y + ", cor=" + cor + "]");
    }
}
