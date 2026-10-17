public class NotificadorMain {

    public static void main(String[] args) {

        Mensagem msg = new Mensagem("Ola, tudo bem?");
        Notificador not = new Notificador();

        not.enviar(msg);
    }
}