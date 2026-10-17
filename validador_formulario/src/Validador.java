public class Validador {

    public boolean validar(Formulario formulario) {
        return formulario.getDados() != null
                && !formulario.getDados().trim().isEmpty();
    }
}