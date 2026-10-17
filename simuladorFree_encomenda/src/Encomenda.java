public class Encomenda {

    private double peso;
    private String destino = "";

    public Encomenda(double peso, String destino) {
        setPeso(peso);
        setDestino(destino);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Encomenda [peso=");
        builder.append(peso);
        builder.append(", destino=");
        builder.append(destino);
        builder.append("]");
        return builder.toString();
    }
}