import java.util.*;

public class Main {
    public static void main(String[] args) {
      FabricaDeNotificadores fabricaEmailTeste = new FabricaNotificadoresTeste();
      FabricaDeNotificadores fabricaEmailProducao = new FabricaNotificadoresProducao();
      FabricaDeNotificadores fabricaSMSTeste = new FabricaNotificadoresTeste();
      FabricaDeNotificadores fabricaSMSProducao = new FabricaNotificadoresProducao();
      
      NotificadorSMS notificadorSMSTeste = fabricaSMSTeste.criarNotificadorSMS();
      NotificadorSMS notificadorSMSProducao = fabricaSMSProducao.criarNotificadorSMS();
      
      NotificadorEmail notificadorEmailTeste = fabricaEmailTeste.criarNotificadorEmail();
      NotificadorEmail notificadorEmailProducao = fabricaEmailProducao.criarNotificadorEmail();
      
      notificadorSMSTeste.enviarSMS();
      notificadorSMSProducao.enviarSMS();
      
      notificadorEmailTeste.enviarEmail();
      notificadorEmailProducao.enviarEmail();
  }
}