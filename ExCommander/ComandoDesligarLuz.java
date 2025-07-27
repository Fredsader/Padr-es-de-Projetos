public class ComandoDesligarLuz implements Comando {
    private Luz luz;

    public ComandoDesligarLuz(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.desligar();
    }

    public void desfazer() {
        luz.ligar();
    }
}
