public class Main {
    public static void main(String[] args) {
        CriadorDeEditor fabricaDeEditorTexto = new CriadorDeEditorTexto();
        CriadorDeEditor fabricaDeEditorPlanilha = new CriadorDeEditorPlanilha();

        fabricaDeEditorTexto.abrir();
        fabricaDeEditorPlanilha.abrir();
    }
}

