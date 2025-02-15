public class PagamentoCartao implements Pagamento <Double> {
    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Pagamento com cartão no valor de R$ " + valor);
    }
}
