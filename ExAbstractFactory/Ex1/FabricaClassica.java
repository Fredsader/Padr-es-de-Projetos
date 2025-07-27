public class FabricaClassica implements FabricaDeComponentes {

    @Override
    public Botao criarBotao() {
        return new BotaoClassico();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaClassica();
    }
}
