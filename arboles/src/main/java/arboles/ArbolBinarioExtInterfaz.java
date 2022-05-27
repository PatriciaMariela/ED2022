package arboles;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;

public interface ArbolBinarioExtInterfaz <T>{
/** Indica la cantidad de elementos almacenados en la estructura. */
public int size();
/** Indica si dos nodos son hermanos*/
public boolean hermanos(NodoArbolBinario<T> nodo1, NodoArbolBinario<T>
nodo2);
/** Devuelve todos los nodos hoja de la estructura*/
public ListaEnlazada<T> hojas();
/** Devuelve todos los nodos que no son raíz ni hoja*/
public ListaEnlazada<T> internos();
/** Devuelve todos los nodos que pertenecen al nivel pasado por parámetro.*/
public ListaEnlazada<T> nivel(int nivel);
}
