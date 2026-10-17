public class Operacao {

    private String expressao = "";

    public Operacao(String expressao) {
        setExpressao(expressao);
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Operacao [expressao=");
        builder.append(expressao);
        builder.append("]");
        return builder.toString();
    }
}