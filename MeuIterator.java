public interface MeuIterator<T>{
    
    /*criação de uma interface genérica com métodos abstratos a serem implementados, 
    Onde T delimita o tipo de coleção*/

    boolean hasNext();
    T next();

}