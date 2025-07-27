public interface FabricaDeNotificadores {
  NotificadorSMS criarNotificadorSMS();
  NotificadorEmail criarNotificadorEmail();
}