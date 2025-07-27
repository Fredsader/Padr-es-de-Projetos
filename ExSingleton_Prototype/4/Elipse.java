public class Elipse extends Figura {
    public int centro;
    
    public Elipse(){}

    private Elipse(Elipse outra){
        super(outra);
        if (outra != null){
            this.centro = outra.centro;
        }
    }
    @Override
    public Figura clonar() {
        return new Elipse(this);
    }
    
}
