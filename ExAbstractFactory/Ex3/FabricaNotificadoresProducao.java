public class FabricaNotificadoresProducao implements FabricaDeNotificadores {
  @Override
  public NotificadorEmail criarNotificadorEmail(){
    return new NotificadorEmailProducao();
  }
  @Override
  public NotificadorSMS criarNotificadorSMS(){
    return new NotificadorSMSProducao();
  }
}