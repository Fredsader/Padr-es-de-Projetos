public class FabricaNotificadoresTeste implements FabricaDeNotificadores {
  @Override
  public NotificadorEmail criarNotificadorEmail(){
    return new NotificadorEmailTeste();
  }
  @Override
  public NotificadorSMS criarNotificadorSMS(){
    return new NotificadorSMSTeste();
  }
}