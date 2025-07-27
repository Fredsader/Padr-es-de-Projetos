
public class Main {
    public static void main(String[] args) {
      InstanciaUnica p1 = InstanciaUnica.getInstanciaUnica();
      System.out.println(p1.getCounter());
      
      InstanciaUnica p2 = InstanciaUnica.getInstanciaUnica();
      InstanciaUnica p3 = InstanciaUnica.getInstanciaUnica();
      InstanciaUnica p4 = InstanciaUnica.getInstanciaUnica();
      InstanciaUnica p5 = InstanciaUnica.getInstanciaUnica();
      System.out.println(p1.getCounter());
    }
}