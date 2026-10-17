public class ProcessadorPagamentoMain {

    public static void main(String[] args) {

        Pagamento pag = new Pagamento(150.00);
        ProcessadorPagamento proc = new ProcessadorPagamento();

        proc.processar(pag);
    }
}