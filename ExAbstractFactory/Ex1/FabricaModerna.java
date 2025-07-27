public class FabricaModerna implements FabricaDeComponentes {
    @Override
    public Botao criarBotao() {
        return new BotaoModerno();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaModerna();
    }

}
