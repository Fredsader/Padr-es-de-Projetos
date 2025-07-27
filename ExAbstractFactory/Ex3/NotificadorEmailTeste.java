public class NotificadorEmailTeste implements NotificadorEmail {
  @Override
  public void enviarEmail(){
    System.out.println("Enviando Email de teste...");
  }
}