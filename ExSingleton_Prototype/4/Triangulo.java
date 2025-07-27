public class Triangulo extends Figura {
    public int altura;
    public int base;
    
    public Triangulo(){}
    private Triangulo (Triangulo outro){
      super(outro);
      if (outro != null){
        this.altura = outro.altura;
        this.base = outro.base;
      }
    }
    
    @Override
    public Figura clonar(){
      return new Triangulo(this);
    }
  }