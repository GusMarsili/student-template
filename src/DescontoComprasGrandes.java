public final class DescontoComprasGrandes extends Desconto{
    private int quantidadeMinima;
    private double taxaDesconto;

    public DescontoComprasGrandes(Pedido pedido, int quantidadeMinima, double taxaDesconto) {
        super(pedido);
        this.quantidadeMinima = quantidadeMinima;
        this.taxaDesconto = taxaDesconto;
    }

    @Override
    public double getDesconto() {
        return pedido.getQuantity() >= quantidadeMinima
            ? pedido.getFinalPrice() * taxaDesconto
            : 0;
    }

}
