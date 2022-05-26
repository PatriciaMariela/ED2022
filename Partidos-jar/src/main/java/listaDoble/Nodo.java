package listaDoble;


public class Nodo<T> {
	private T dato;
	private Nodo<T> anterior;
	private Nodo<T> siguiente;
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public Nodo<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
}
