public class EmailService {
    private GmailSender sender;

    public EmailService(GmailSender sender) {
        this.sender = sender;
    }

    public String notificar(String destinatario, String mensagem){
       return sender.enviarEmail(destinatario, mensagem);
    }

}

