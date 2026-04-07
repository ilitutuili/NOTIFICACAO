public class Main {
    public static void main(String[] args) {
        NotificacaoFactory factory;

        factory = new EmailFactory();
        factory.enviarNotificacao("Olá por Email!");

        factory = new SMSFactory();
        factory.enviarNotificacao("Olá por SMS!");

        factory = new PushFactory();
        factory.enviarNotificacao("Olá por Push!");

        factory = new WhatsAppFactory();
        factory.enviarNotificacao("Olá por WhatsApp!");
    }
}