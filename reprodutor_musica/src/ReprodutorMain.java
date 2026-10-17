public class ReprodutorMain {

    public static void main(String[] args) {

        Musica mus = new Musica("Minha Musica", 180);
        Reprodutor rep = new Reprodutor();

        rep.reproduzir(mus);
    }
}