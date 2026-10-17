public class Relatorio {

    private String conteudo = "";

    public Relatorio(String conteudo) {
        setConteudo(conteudo);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Relatorio [conteudo=");
        builder.append(conteudo);
        builder.append("]");
        return builder.toString();
    }
}