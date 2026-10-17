public class ExportadorMain {

    public static void main(String[] args) {

        Relatorio rel = new Relatorio("Relatorio de vendas");
        Exportador exp = new Exportador();

        exp.exportar(rel);
    }
}