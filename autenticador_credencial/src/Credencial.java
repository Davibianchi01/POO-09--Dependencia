public class Credencial {

    private String usuario = "";
    private String senha = "";

    public Credencial(String usuario, String senha) {
        setUsuario(usuario);
        setSenha(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Credencial [usuario=");
        builder.append(usuario);
        builder.append("]");
        return builder.toString();
    }
}