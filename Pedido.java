import java.util.List;

public class Pedido {

    private int idPedido;
    private int idCliente;
    private List<Item> itens;

    public Pedido(int idPedido, int idCliente, List<Item> itens) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.itens = itens;
    }

    public Pedido(List<Item> itens) {
        this.itens = itens;
    }

    public int getIdPedido(int idPedido) {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setItensId() {
        for (Item item : itens) {
            item.setIdPedido(idPedido);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            if (item != null) {
                total += item.calcularSubtotal();
            }
        }
        return total;
    }

    // Método para retornar os detalhes dos itens do pedido
    public String getDetalhesItens() {
        String detalhes = "";
        for (Item item : itens) {
            detalhes += "Descrição: " + item.getDescricao() +
                        ", Quantidade: " + item.getQuantidade() +
                        ", Preço Unitário: " + item.getPrecoUnitario() +
                        ", Subtotal: " + item.calcularSubtotal() +
                        "\n";
        }
        return detalhes;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", idCliente=" + idCliente +
                ", itens=\n" + getDetalhesItens() +
                '}';
    }
}