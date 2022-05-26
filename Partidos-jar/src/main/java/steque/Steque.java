package steque;

import java.util.ArrayList;
import java.util.List;

public class Steque<T> implements StequeInterfaz<T>{
	private int top;
	private List<T> dato;
	
	
	
	public Steque()	{
		dato = new ArrayList<>();	
		top = 0;
	}
	@Override
	public boolean isEmpty() {		
		return dato.size()==0;
	}

	@Override
	public T top() {		
		return dato.get(top);
	}

	@Override
	public void enqueue(T elemento) {
		dato.add(top, elemento);
		
	}

	@Override
	public void pop() {
		dato.remove(top);
		
	}

	@Override
	public void push(T elemento) {
		dato.add(elemento);		
	}

	@Override
	public void makeEmpty() {
		dato.removeAll(dato);
		
	}

}
