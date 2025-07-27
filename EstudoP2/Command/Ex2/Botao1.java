public class Botao1{
    private Comando comando;

    public void setComando(Comando comando){
        this.comando = comando;
    }

    public void pressionar(){
        comando.executar();
    }
}
