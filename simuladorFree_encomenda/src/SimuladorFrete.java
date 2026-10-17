public class SimuladorFrete {

    public double calcularFrete(Encomenda encomenda) {
        return encomenda.getPeso() * 2.50;
    }
}