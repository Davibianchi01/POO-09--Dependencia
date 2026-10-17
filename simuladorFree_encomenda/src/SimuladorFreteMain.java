public class SimuladorFreteMain {

    public static void main(String[] args) {

        Encomenda enc = new Encomenda(10, "Rio do Sul");
        SimuladorFrete sim = new SimuladorFrete();

        System.out.println(enc);
        System.out.println("Frete: R$ " + sim.calcularFrete(enc));
    }
}