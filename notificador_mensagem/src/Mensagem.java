public class Mensagem {

    private String texto = "";

    public Mensagem(String texto) {
        setTexto(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mensagem [texto=");
        builder.append(texto);
        builder.append("]");
        return builder.toString();
    }
}