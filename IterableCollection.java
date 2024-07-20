
//Cria um método abstrato(!) que será responsável por definir o tipo da coleção!

public interface IterableCollection<T>{

    MeuIterator<T> createIterator();

}