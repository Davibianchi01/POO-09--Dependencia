public class Formulario {

    private String dados = "";

    public Formulario(String dados) {
        setDados(dados);
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Formulario [dados=");
        builder.append(dados);
        builder.append("]");
        return builder.toString();
    }
}