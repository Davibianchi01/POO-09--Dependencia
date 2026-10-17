public class Livro {
    private String titulo = "";

    public Livro(String titulo) {
        setTitulo(titulo);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Livro [titulo=");
        builder.append(titulo);
        builder.append("]");
        return builder.toString();
    }

}