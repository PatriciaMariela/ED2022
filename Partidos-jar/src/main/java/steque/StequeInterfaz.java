package steque;

public interface StequeInterfaz <T> {
/** Indica si la estructura está vacía*/
public boolean isEmpty();
/** Retorna el elemento ubicado en el tope de la estructura.*/
public T top();
/** Agrega elemento al final de la estructura.*/
public void enqueue(T elemento);
/** Quita la posición ubicada en el tope de la estructura.*/
public void pop();
/** Agrega elemento en el tope de la estructura.*/
public void push(T elemento);
/** Vacía la estructura */
public void makeEmpty();
/** Concatena en un String() todos los de la estructura. */
@Override
public String toString();
}
