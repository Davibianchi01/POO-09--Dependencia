public class ConversorMain {

    public static void main(String[] args) {

        Arquivo arq = new Arquivo("documento", "PDF");
        Conversor conv = new Conversor();

        conv.converter(arq);
    }
}