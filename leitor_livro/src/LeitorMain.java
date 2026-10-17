public class LeitorMain {

    public static void main(String[] args) {

        Livro liv = new Livro("Diario de um banana");
        Leitor lei = new Leitor("Davi");

        System.out.println(lei.ler(liv));

    }

}