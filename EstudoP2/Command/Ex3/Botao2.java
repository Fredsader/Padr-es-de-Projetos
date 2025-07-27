public class Botao2 {
    private Comando comando;
    int cont = 0;

    public void setComando(Comando comando){
        this.comando = comando;
    }

    public void pressionar(){
        comando.executar();
        cont++;
    }
}
