import java.util.ArrayList;

public abstract class Pedido {
    private int quantity;
    private double individualPrice;
    private Cliente cliente;
    private ArrayList<Desconto> descontos;
    private MeioPagamento meioPagamento;

    public enum MeioPagamento {
        DINHEIRO, CARTAO, PIX
    }

    public Pedido(int quantity, double individualPrice, Cliente cliente, MeioPagamento meioPagamento) {
        this.quantity = quantity;
        this.individualPrice = individualPrice;
        this.cliente = cliente;
        this.meioPagamento = meioPagamento;
        this.descontos = new ArrayList<Desconto>();

        if (cliente.isLoyal()) {
            addDesconto(new DescontoFixo(this, 0.05));
        }

        if (meioPagamento == meioPagamento.DINHEIRO || meioPagamento == meioPagamento.PIX) {
            addDesconto(new DescontoFixo(this, 0.04));
        }
    }

    public void addDesconto(Desconto desconto) {
        this.descontos.add(desconto);
    }

    public int getQuantity() {
        return quantity;
    }

    public double getIndividualPrice() {
        return individualPrice;
    }

    public double getFinalPrice() {
        return getQuantity() * getIndividualPrice();
    }

    public double getDescontos() {
        double total = 0.0;

        for (Desconto desconto : descontos) {
            total += desconto.getDesconto();
        }

        return total;
    }

    public abstract double getAcrescimo(); 

    public final double precoFinal() {
        return getFinalPrice() - getDescontos();
    }
}
