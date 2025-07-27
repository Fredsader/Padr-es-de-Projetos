public class ComandoLigarTV implements Comando {
    private TV tv;

    public ComandoLigarTV(TV tv) {
        this.tv = tv;
    }

    public void executar() {
        tv.ligar();
    }

    public void desfazer() {
        tv.desligar();
    }
}
