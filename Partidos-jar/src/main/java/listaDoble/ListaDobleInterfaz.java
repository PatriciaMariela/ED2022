package listaDoble;

public interface ListaDobleInterfaz<T> {
/** Indica si la lista está vacía*/
public boolean isEmpty();
/** Devuelve la cantidad de elementos de la estructura.*/
public int size();
/** Devuelve el elemento ubicado en la posición indicada por index. */
public T get(int index);
/** Agrega un elemento al final de la lista. */
public void add(T element);
/** Quita un elemento de la lista. */
public void remove(T element);
/** Devuelve un iterador por sobre la estructura. */
public IteradorListaDobleInterfaz<T> iterador();
/** Concatena todos los elementos de la estructura en un String. */
public String toString();
}
