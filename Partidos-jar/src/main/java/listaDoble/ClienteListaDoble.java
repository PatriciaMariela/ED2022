package listaDoble;



public class ClienteListaDoble {
	
	
	public static void main(String[] args) {
		ListaDoble<String> miLista = new ListaDoble<String>();
		ListaDoble<String> miLista2 = new ListaDoble<String>();
	
		
		miLista.add("Juan");
		miLista.add("María");
		miLista.add("Lucía");
		miLista.add("Mirta");
		miLista.add("Manuela");
		
		miLista.mostrarListaDoble();
		System.out.println("miLista.get(5): "+miLista.get(5));
		System.out.println("miLista.isEmpty(): "+ miLista.isEmpty());
		System.out.println("miLista.size(): "+ miLista.size());
		miLista.remove("Lucía");
		System.out.println("miLista.remove(\"Lucía\")");
		miLista.mostrarListaDoble();
		System.out.println("miLista.size(): "+ miLista.size());
		
		System.out.println("miLista2.isEmpty(): "+miLista2.isEmpty());
		System.out.println("miLista2.size(): "+miLista2.size());
		
				
		
		System.out.println("miLista.iterador().existeSiguiente(): "+ miLista.iterador().existeSiguiente());		
		System.out.println("miLista.iterador().siguiente(): "+ miLista.iterador().siguiente());
		System.out.println("miLista.iterador().anterior(): "+ miLista.iterador().anterior());
		System.out.println("miLista.iterador().siguiente(): "+ miLista.iterador().anterior());
		System.out.println("miLista.iterador().existeAnterior(): "+ miLista.iterador().existeAnterior());
		System.out.println("miLista.iterador().primero(): "+ miLista.iterador().primero());
		System.out.println("miLista.iterador().ultimo(): "+ miLista.iterador().ultimo());
		
		
	}
	
	
	
}
