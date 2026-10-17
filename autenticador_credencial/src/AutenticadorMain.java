public class AutenticadorMain {

    public static void main(String[] args) {

        Credencial cred = new Credencial("Davi", "12345");
        Autenticador aut = new Autenticador();

        System.out.println(aut.autenticar(cred));
    }
}