public class Notificador {

    public void enviar(Mensagem mensagem) {
        System.out.println("Mensagem enviada: "
                + mensagem.getTexto());
    }
}