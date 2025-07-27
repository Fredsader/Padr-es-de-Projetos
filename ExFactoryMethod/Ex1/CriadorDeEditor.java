public abstract class CriadorDeEditor {
    public abstract Editor criarEditor();

    public void abrir(){
        Editor editor = criarEditor();
        editor.lerDocumento();
    }
}
