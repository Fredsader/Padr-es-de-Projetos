public abstract class Figura {
    public int x;
    public int y;
    public String cor;
    
    public Figura(){}
    
    public Figura (Figura outra){
      if (outra != null){
        this.x = outra.x;
        this.y = outra.y;
        this.cor = outra.cor;
      }
    }
    public abstract Figura clonar();
    
    public void exibirInfo(){
      System.out.println(this.x + this.y + this.cor);
  }
}
