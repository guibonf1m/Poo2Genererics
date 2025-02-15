public class PagamentoPix implements Pagamento <Integer> {
    @Override
    public void processarPagamento(Integer valor) {
        System.out.println("Processando pagamento com pix no valor de R$ " + valor);
    }
}
