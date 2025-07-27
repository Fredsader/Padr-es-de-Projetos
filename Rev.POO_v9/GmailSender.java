public class GmailSender implements EmailService {
    @Override
    public String enviarEmail(String destinatario, String mensagem){
        return ("Enviando email via Gmail para"+ destinatario + ": " + mensagem);
    }
}
