public class CalculadoraMain {

    public static void main(String[] args) {

        Operacao op = new Operacao("10 + 5");
        Calculadora calc = new Calculadora();

        System.out.println("Resultado: " + calc.calcular(op));
    }
}