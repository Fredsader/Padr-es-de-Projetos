public class InstanciaUnica {
    private static InstanciaUnica instance;
    private static int counter;
    
    private InstanciaUnica(){}
    
    public static InstanciaUnica getInstanciaUnica(){
      if (instance == null){
        instance = new InstanciaUnica();
        counter = 0;
      }
      counter += 1;
      return instance;
    }
    public int getCounter(){
      return counter;
    }
  }