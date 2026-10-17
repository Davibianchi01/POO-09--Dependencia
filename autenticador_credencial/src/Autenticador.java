public class Autenticador {

    public boolean autenticar(Credencial credencial) {
        return credencial.getUsuario() != null
                && !credencial.getUsuario().isEmpty()
                && credencial.getSenha() != null
                && !credencial.getSenha().isEmpty();
    }
}