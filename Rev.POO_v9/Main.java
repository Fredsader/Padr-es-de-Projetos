public class Main {
    public static void main(String[] args) {
        EmailService gmail = new GmailSender();

        System.out.println(gmail.enviarEmail("Fred", "oi"));
    }
}
