public class Conversor {

    public void converter(Arquivo arquivo) {
        System.out.println("Convertendo arquivo: "
                + arquivo.getNome());
        System.out.println("Formato: " + arquivo.getFormato());
    }
}