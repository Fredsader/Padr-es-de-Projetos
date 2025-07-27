public class CriadorDeCampoEmail extends CriadorDeCampoFormulario{
    @Override
    protected Campo criarCampo() {
        return new CampoEmail();
    }
    
}
