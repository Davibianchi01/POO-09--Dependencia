public class Musica {

    private String titulo = "";
    private int duracao;

    public Musica(String titulo, int duracao) {
        setTitulo(titulo);
        setDuracao(duracao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Musica [titulo=");
        builder.append(titulo);
        builder.append(", duracao=");
        builder.append(duracao);
        builder.append("]");
        return builder.toString();
    }
}