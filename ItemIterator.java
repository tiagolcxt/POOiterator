import java.util.Iterator;
import java.util.List;

public class ItemIterator implements MeuIterator<Item> {
    private List<Item> itens;
    private int position = 0;

    public ItemIterator(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return position < itens.size();
    }

    @Override
    public Item next() {
        if (this.hasNext()) {
            return itens.get(position++);
        }
        return null;
    }
}