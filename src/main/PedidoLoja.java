package main;

public class PedidoLoja extends Pedido {

    public PedidoLoja(String codigoPedido, String nomeProduto, float precoProduto) {
        super(codigoPedido, nomeProduto, precoProduto);
    }

    @Override
    protected float CalculaFrete() {
        System.out.println("Pedido em loja nao possui frete");
        return 0;
    }

    @Override
    protected float CalculaDesconto() {
        return (float) 0.05;
    }

}
