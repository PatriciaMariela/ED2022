package arboles;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;

public class ArbolBinarioExt<T> extends ArbolBinario<T> implements ArbolBinarioExtInterfaz <T> {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hermanos(NodoArbolBinario<T> nodo1, NodoArbolBinario<T> nodo2) {
		return false;
	}

	@Override
	public ListaEnlazada<T> hojas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaEnlazada<T> internos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaEnlazada<T> nivel(int nivel) {
		// TODO Auto-generated method stub
		return null;
	}

}
