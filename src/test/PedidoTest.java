package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.*;

public class PedidoTest {
    @Test
    public void deveRetonarPrecoDoFretePedidoLoja() {
        PedidoLoja pedido = new PedidoLoja("123456", "Geladeira", 2380);
        float precoEsperado = (float) (pedido.getprecoProduto() * 0.95);
        assertEquals(precoEsperado, pedido.CalculaPrecoPedido(), 0);
    }

    @Test
    public void deveRetonarPrecoDoFretePedidoOnlineComDesconto() {
        PedidoOnline pedido = new PedidoOnline("123456A", "Fogao", 1570);
        float precoEsperado = (float) (pedido.getprecoProduto() * 0.80 + 8.90);
        assertEquals(precoEsperado, pedido.CalculaPrecoPedido(), 0);
    }

    @Test
    public void deveRetonarPrecoDoFretePedidoOnlineSemDesconto() {
        PedidoOnline pedido = new PedidoOnline("123456", "Fogao", 1570);
        float precoEsperado = (float) (pedido.getprecoProduto() + 8.90);
        assertEquals(precoEsperado, pedido.CalculaPrecoPedido(), 0);
    }

}
