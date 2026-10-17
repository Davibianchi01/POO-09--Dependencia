public class Leitor {

    public Leitor(String nome) {
        setNome(nome);
    }

    private String nome = "";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String ler(Livro livro) {

        StringBuilder sb = new StringBuilder();
        sb.append(this.getNome());
        sb.append(" está lendo o livro: ");
        sb.append(livro.getTitulo());

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Leitor [nome=");
        builder.append(nome);
        builder.append("]");
        return builder.toString();
    }

}