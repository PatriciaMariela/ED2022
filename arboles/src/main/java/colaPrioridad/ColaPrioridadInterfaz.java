package colaPrioridad;

public interface ColaPrioridadInterfaz <T extends Comparable<T>>{
/** Inserta un elemento en la estructura. */
public void insert(T element);
/** Devuelve el elemento con máximo valor de clave. */
public T max();
/** Elimina el elemento con máximo valor de clave. */
public void deleteMax();
/** Indica si la estructura está vacía o no. */
public boolean isEmpty();
/** Indica la cantidad de elementos en la estructura.*/
public int size();
/** Concatena en un String el estado actual de la estructura. */
public String toString();
}