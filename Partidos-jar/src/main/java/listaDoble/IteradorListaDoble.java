package listaDoble;


public class IteradorListaDoble<T> implements IteradorListaDobleInterfaz<T> {
	private Nodo<T> actual;
	

	public IteradorListaDoble() {		

	}

	public IteradorListaDoble(Nodo<T> primero) {
		this.actual = primero;
		
	}

	@Override
	public boolean existeSiguiente() {
		return (actual.getSiguiente()!=null);
	}

	@Override
	public T siguiente() {		
		T siguienteElemento = actual.getSiguiente().getDato();		
		return siguienteElemento;
	}

	@Override
	public T primero() {
		T primero = null;
		if(actual.getAnterior()!=null || actual.getSiguiente()==null) {
			primero = actual.getDato();
		}

		return primero;

	}

	@Override
	public boolean existeAnterior() {
		return actual.getAnterior()!=null;
	}

	@Override
	public T anterior() {
		T anterior = actual.getDato();		
		return anterior;
	}

	@Override
	public T ultimo() {
		T ultimo = null;
		if(actual.getAnterior()==null && actual.getSiguiente()!=null) {
			ultimo = actual.getDato();
		}

		return ultimo;
	}

}
