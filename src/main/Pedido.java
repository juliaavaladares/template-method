package main;

public abstract class Pedido {
    private String codigoPedido;
    private String nomeProduto;
    private float precoProduto;

    public Pedido(String codigoPedido, String nomeProduto, float precoProduto) {
        this.codigoPedido = codigoPedido;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getprecoProduto() {
        return precoProduto;
    }

    public void setprecoProduto(Float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public float CalculaPrecoPedido() {
        return (this.precoProduto * (1 - CalculaDesconto()) + CalculaFrete());
    }

    protected abstract float CalculaFrete();

    protected abstract float CalculaDesconto();

}