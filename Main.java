import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação dos itens
        Item item1 = new Item("camiseta", 3, 55.00f);
        Item item2 = new Item("calca", 2, 80.00f);
        Item item3 = new Item("bone", 1, 72.00f);
        Item item4 = new Item("meia", 5, 20.00f);
        Item item5 = new Item("tenis", 1, 200.00f);
        Item item6 = new Item("casaco", 1, 220.00f);
        Item item7 = new Item("relogio", 1, 250.00f);

        // Criação das listas de itens
        List<Item> itensPedido1 = new ArrayList<>();
        itensPedido1.add(item1);
        itensPedido1.add(item2);
        itensPedido1.add(item3);

        List<Item> itensPedido2 = new ArrayList<>();
        itensPedido2.add(item4);
        itensPedido2.add(item5);
        itensPedido2.add(item6);
        itensPedido2.add(item7);

        // Criação dos pedidos
        Pedido pedido1 = new Pedido(1, 101, itensPedido1);
        pedido1.setItensId();
        Pedido pedido2 = new Pedido(2, 101, itensPedido2);
        pedido2.setItensId();

        // Criação da lista de pedidos
        ListaDePedidos listaDePedidos = new ListaDePedidos();
        listaDePedidos.novoPedido(pedido1);
        listaDePedidos.novoPedido(pedido2);

        // Iteração sobre os pedidos
        MeuIterator<Pedido> pedidoIterator = listaDePedidos.createIterator();
        while (pedidoIterator.hasNext()) {
            Pedido pedido = pedidoIterator.next();
            System.out.println(pedido);
            System.out.println("Total do Pedido: " + pedido.calcularTotal());
            
            // Iteração sobre os itens do pedido
            MeuIterator<Item> itemIterator = new ItemIterator(pedido.getItens());
            while (itemIterator.hasNext()) {
                Item item = itemIterator.next();
                System.out.println("Item: " + item.getDescricao() + ", Quantidade: " + item.getQuantidade() + 
                                   ", Preço Unitário: " + item.getPrecoUnitario() + ", Subtotal: " + item.calcularSubtotal());
            }
            System.out.println("Total do Pedido: " + pedido.calcularTotal());
            System.out.println("--------------------------------------------------");
        }
    }
}