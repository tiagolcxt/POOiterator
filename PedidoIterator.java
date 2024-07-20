import java.util.Iterator;
import java.util.List;

public class PedidoIterator implements MeuIterator<Pedido>{
    //implementa a interface Iterator na classe PedidoIterator
    private List<Pedido> pedidos;
    private int pos;


    public PedidoIterator(List<Pedido> pedidos) {
        this.pedidos = pedidos;
        this.pos = 0;
    }

    @Override
    public boolean hasNext(){
        return pos < pedidos.size();
    }

    @Override
    public Pedido next() {
        return pedidos.get(pos++);
    }
}