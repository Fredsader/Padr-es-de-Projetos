public class Main {
    public static void main(String[] args) {
        GmailSender gmail = new GmailSender();
        EmailService email = new EmailService(gmail);

        System.out.println(email.notificar("fred", "mensagem"));
    }
}
