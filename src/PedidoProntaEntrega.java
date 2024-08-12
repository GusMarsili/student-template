public class PedidoProntaEntrega extends Pedido{
    private static final double TAXA_DESCONTO = 0.03;

    public PedidoProntaEntrega(int quantity, double individualPrice, Cliente cliente,
            Pedido.MeioPagamento meioPagamento) {
        super(quantity, individualPrice, cliente, meioPagamento);
        addDesconto(new DescontoFixo(this, TAXA_DESCONTO));
    }

    @Override
    public double getAcrescimo() {
        return 0.0;
    }
}
