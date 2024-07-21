import java.util.ArrayList;
import java.util.List;

// Implementação concreta da Coleção InterableCollection

public class ListaDePedidos implements IterableCollection<Pedido>{

    private List<Pedido> pedidos;

    //construtor
    public ListaDePedidos (){
        this.pedidos = new ArrayList<>();
    }

    public void novoPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    //define o tipo de coleção. <Pedido> = tipo de retorno do método createIterator
    @Override
    public MeuIterator<Pedido> createIterator() {

        //retorna uma nova instâncias de PedidoIterator, passando a lista de pedidos comos parâmetros para o contrutor
        return new PedidoIterator(this.pedidos);
    }


}