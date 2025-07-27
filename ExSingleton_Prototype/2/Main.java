
public class Main {
    public static void main(String[] args) {
      
      ConfigSingleton p1 = ConfigSingleton.getInstance ("ingles", "noite", 2);
      ConfigSingleton p2 = ConfigSingleton.getInstance ("portugues", "dia", 5);
      
      System.out.println(p1.getIdioma() + p1.getModo() + p1.getVolume());
      System.out.println(p2.getIdioma() + p2.getModo() + p2.getVolume());
      System.out.println(p1 == p2);
      
      p2.setIdioma("portugues");
      System.out.println(p1.getIdioma());
  }
}