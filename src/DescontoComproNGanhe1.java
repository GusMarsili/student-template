public final class DescontoComproNGanhe1 extends Desconto{
    private int n;

    public DescontoComproNGanhe1(Pedido pedido, int n) {
        super(pedido);
        this.n = n;
    }
    
    @Override
    public double getDesconto() {
        return (pedido.getQuantity() / n) * pedido.getIndividualPrice();    
    }
}
