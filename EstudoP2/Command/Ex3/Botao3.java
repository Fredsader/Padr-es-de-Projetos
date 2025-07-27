public class Botao3 {
    private Comando comando;
    int cont;

    public void setComando(Comando comando){
        this.comando = comando;
    }

    public void pressionar(){
        comando.executar();
        cont++;
    }
}
