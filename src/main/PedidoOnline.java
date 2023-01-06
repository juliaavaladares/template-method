package main;

public class PedidoOnline extends Pedido {

    public PedidoOnline(String codigoPedido, String nomeProduto, float precoProduto) {
        super(codigoPedido, nomeProduto, precoProduto);
    }

    @Override
    protected float CalculaFrete() {
        return (float) 8.90;
    }

    @Override
    protected float CalculaDesconto() {
        String codigoPedido = this.getCodigoPedido();
        if (codigoPedido.contains("A")) {
            return (float) 0.20;
        }
        return 0;
    }

}
