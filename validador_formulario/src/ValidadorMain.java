public class ValidadorMain {

    public static void main(String[] args) {

        Formulario form = new Formulario("Nome: Davi");
        Validador val = new Validador();

        System.out.println(val.validar(form));
    }
}