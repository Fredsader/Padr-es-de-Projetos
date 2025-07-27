public class CriadorDeEditorTexto extends CriadorDeEditor{

    @Override
    public Editor criarEditor() {
        return new EditorTexto();
    }
    
}
