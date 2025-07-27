public class CriadorDeEditorPlanilha extends CriadorDeEditor{

    @Override
    public Editor criarEditor() {
        return new EditorPlanilha();
    }

}
