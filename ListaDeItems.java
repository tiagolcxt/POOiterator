import java.util.ArrayList;
import java.util.List;

// Implementação concreta da Coleção InterableCollection( definição do tipo)

public class ListaDeItems implements IterableCollection<Item>{

    private List<Item> itens;

    //construtor
    public ListaDeItems (){
        this.itens = new ArrayList<>();
    }

    public void novoItem(Item item){
        itens.add(item);
    }

    //define o tipo de coleção. <Item> => tipo de retorno do método createIterator
    @Override
    public MeuIterator<Item> createIterator() {

        //retorna uma nova instâncias de ItemIterator, passando a lista de itens comos parâmetros para o contrutor
        return new ItemIterator(this.itens);
    }


}