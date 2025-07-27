public abstract class CriadorDeCampoFormulario {
    protected abstract Campo criarCampo();

    public void mostrarCampo(){
        Campo campo = criarCampo();
        campo.mostrarTipo();
    }
}
