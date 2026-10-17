public class Calculadora {

    public double calcular(Operacao operacao) {
        String expressao = operacao.getExpressao();
        String[] numeros = expressao.split("\\+");

        return Double.parseDouble(numeros[0].trim())
                + Double.parseDouble(numeros[1].trim());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Calculadora []");
        return builder.toString();
    }
}