public class NotificadorEmailProducao implements NotificadorEmail {
  @Override
  public void enviarEmail(){
    System.out.println("Enviando Email de produção...");
  }
}