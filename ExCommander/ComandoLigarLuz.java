public class ComandoLigarLuz implements Comando {
    private Luz luz;

    public ComandoLigarLuz(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.ligar();
    }

    public void desfazer() {
        luz.desligar();
    }
}
