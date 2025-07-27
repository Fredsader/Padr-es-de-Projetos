public class ComandoLigarTv  implements Comando{
    private TV tv;

    public ComandoLigarTv (TV tv){
        this.tv = tv;
    }

    public void executar() {
       tv.ligar();
    }

}
