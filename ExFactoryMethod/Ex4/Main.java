public class Main {
    public static void main(String[] args) {
        CriadorDeCampoFormulario criadorDeCampoTexto = new CriadorDeCampoTexto();
        CriadorDeCampoFormulario criadorDeCampoEmail = new CriadorDeCampoEmail();
        CriadorDeCampoFormulario criadorDeCampoData = new CriadorDeCampoData();
      
        criadorDeCampoData.mostrarCampo();
        criadorDeCampoEmail.mostrarCampo();
        criadorDeCampoTexto.mostrarCampo();
    }
}
