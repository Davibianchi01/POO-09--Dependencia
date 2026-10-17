public class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pagamento [valor=");
        builder.append(valor);
        builder.append("]");
        return builder.toString();
    }
}