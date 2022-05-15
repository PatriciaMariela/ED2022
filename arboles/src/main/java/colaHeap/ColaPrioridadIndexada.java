package colaHeap;

public interface ColaPrioridadIndexada <T extends Comparable<T>>{
/** Inserta un elemento en la estructura*/
public void insert (int indice, T item);
/** Cambia el elemento ubicado en la posición indicada por índice.*/
public void change (int indice, T item);
/** Indica si existe un elemento con igual índice al pasado por parámetro.*/
public boolean contains(int indice);
/** Elimina el elemento cuyo índice es coincidente con el parámetro.*/
public void delete(int indice);
/** Retorna el elemento con menor valor de clave. */
public T min();
/** Devuelve el índice del elemento con menor valor de clave.*/
public int minIndex();
/** Indica si la estructura está vacía. */
public boolean isEmpty();
/** Devuelve la longitud de la estructura. */
public int size();
/** Convierte en String el estado actual del objeto. */
@Override
public String toString();
}
