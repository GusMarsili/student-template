public class PedidoEncomenda extends Pedido{
    private String enderecoEntrega;
    private double frete;

    public PedidoEncomenda(int quantity, double individualPrice, Cliente cliente, Pedido.MeioPagamento meioPagamento,
            String enderecoEntrega, double frete) {
        super(quantity, individualPrice, cliente, meioPagamento);
        this.enderecoEntrega = enderecoEntrega;
        this.frete = frete;
    }

    @Override
    public double getAcrescimo() {
        return frete; 
    }
}
