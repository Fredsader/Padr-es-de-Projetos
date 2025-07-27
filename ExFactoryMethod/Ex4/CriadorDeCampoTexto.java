public class CriadorDeCampoTexto extends CriadorDeCampoFormulario {
    @Override
    protected Campo criarCampo() {
        return new CampoTexto();
    }
}
