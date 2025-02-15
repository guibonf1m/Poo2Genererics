// src/Main.java
public class Main {
    public static void main(String[] args) {
        // Simular processamento de pagamento
        Pagamento<Double> pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.processarPagamento(150.75);

        Pagamento<Integer> pagamentoPix = new PagamentoPix();
        pagamentoPix.processarPagamento(200);

        // Criar e usar um carrinho de compras
        Carrinho<String> carrinho = new Carrinho<>();
        carrinho.adicionarItem("Item 1");
        carrinho.adicionarItem("Item 2");
        System.out.println("Total de itens no carrinho: " + carrinho.getQuantidadeTotal());

        // Criar e usar um sistema de gestão de pedidos
        Pedido<String, String> pedido = new Pedido<>();
        pedido.adicionarPedido("Pedido1", "Item A");
        pedido.adicionarPedido("Pedido1", "Item B");
        pedido.adicionarPedido("Pedido2", "Item C");
        System.out.println("Itens no Pedido1: " + pedido.getItensDoPedido("Pedido1"));
        System.out.println("Total de pedidos: " + pedido.getQuantidadeTotalPedidos());

        // Aplicar cupons de desconto
        CupomDesconto<Integer> cupomFixo = new CupomDesconto<>();
        double precoComDescontoFixo = cupomFixo.aplicarDesconto(20, 100.0);
        System.out.println("Preço com desconto fixo: R$" + precoComDescontoFixo);

        CupomDesconto<Double> cupomPercentual = new CupomDesconto<>();
        double precoComDescontoPercentual = cupomPercentual.aplicarDesconto(15.0, 100.0);
        System.out.println("Preço com desconto percentual: R$" + precoComDescontoPercentual);
    }
}