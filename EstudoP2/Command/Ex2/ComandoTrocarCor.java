public class ComandoTrocarCor implements Comando {
    private Luz luz;

    public ComandoTrocarCor (Luz luz){
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.trocarCor();
    }

}
