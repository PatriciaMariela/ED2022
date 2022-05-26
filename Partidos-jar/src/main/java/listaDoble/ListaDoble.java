package listaDoble;

/**
 * 
 * @author Pa
 *
 * @param <T>
 */

public class ListaDoble<T> implements ListaDobleInterfaz<T>{
	private Nodo<T> primero;
	private Nodo<T> ultimo;	
	private int pos=0;
	
	
	
	public ListaDoble() {
       this.primero=null;
       this.ultimo=null;       
       
    }	
	
	@Override
	public boolean isEmpty() {
		return (primero==null);        
    }

	@Override
	public int size() {
		Nodo<T> posicion = new Nodo<T>();
		posicion = primero;
		int cont=0;	
		while(posicion != null) {
			cont++;
			posicion = posicion.getSiguiente();
		}
		return cont;
		
	}

	@Override
	public T get(int index) {
		Nodo<T> buscador = new Nodo<T>();
		T encontrado = null;
		
		buscador = primero;
		while(buscador != null) {
			pos++;
			if(pos==index) {
				encontrado = (T) buscador.getDato();
			}
			buscador=buscador.getSiguiente();
		}
		return encontrado;
	}

	
	@Override
	public void add(T element) {		
		Nodo<T> nuevo = new Nodo<T>();
		nuevo.setDato(element);
		
		if(isEmpty()) {
			primero = nuevo;
			primero.setAnterior(null);
			primero.setSiguiente(null);
			ultimo = primero;	
			
		}else {
			ultimo.setSiguiente(nuevo);
			nuevo.setAnterior(ultimo);	
			nuevo.setSiguiente(null);
			ultimo=nuevo;
			
		}
		
	}

	@Override
	public void remove(T element) {
		Nodo<T> actual = new Nodo<T>();
		Nodo<T> atras = new Nodo<T>();
		actual=primero;
		atras=null;
		
		while(actual != null){
			if(actual.getDato().equals(element)) {
				if(actual.equals(primero)) {
					primero =primero.getSiguiente();
					primero.setAnterior(null);
				}else {
					atras.setSiguiente(actual.getSiguiente());
					actual.getSiguiente().setAnterior(actual.getAnterior());
				}
			}
			atras = actual;
			actual = actual.getSiguiente();
		}
		
		
	}

	@Override
	public IteradorListaDobleInterfaz<T> iterador() {		
		return new IteradorListaDoble<T>(primero);
	}	
	
	
	public void mostrarListaDoble() {
		Nodo<T> actual = new Nodo<T>();
		actual = ultimo;
		while(actual!=null) {
			System.out.println(actual.getDato());
			actual=actual.getAnterior();
		}
	}

}
