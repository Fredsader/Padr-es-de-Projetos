public class Botao {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void pressionar() {
        if (comando != null) {
            comando.executar();
            Controle.addHistorico(comando);
        }
    }
}
