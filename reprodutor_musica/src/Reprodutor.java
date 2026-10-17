public class Reprodutor {

    public void reproduzir(Musica musica) {
        System.out.println("Reproduzindo: " + musica.getTitulo());
        System.out.println("Duracao: " + musica.getDuracao() + " segundos");
    }
}