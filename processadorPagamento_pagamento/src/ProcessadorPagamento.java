public class ProcessadorPagamento {

    public void processar(Pagamento pagamento) {
        if (pagamento.getValor() > 0) {
            System.out.println("Pagamento processado: R$ "
                    + pagamento.getValor());
        } else {
            System.out.println("Valor de pagamento invalido.");
        }
    }
}