public class ComandoDesligarTv  implements Comando{
    private TV tv;

    public ComandoDesligarTv (TV tv){
        this.tv = tv;
    }

    public void executar() {
       tv.desligar();
    }

}