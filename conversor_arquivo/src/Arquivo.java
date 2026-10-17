public class Arquivo {

    private String nome = "";
    private String formato = "";

    public Arquivo(String nome, String formato) {
        setNome(nome);
        setFormato(formato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Arquivo [nome=");
        builder.append(nome);
        builder.append(", formato=");
        builder.append(formato);
        builder.append("]");
        return builder.toString();
    }
}