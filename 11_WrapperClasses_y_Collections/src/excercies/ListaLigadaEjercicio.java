package excercies;

class ListaLigada<T> {
	Nodo<T> nodoInicial;
	
	void agregar(T valor) {
		
		if (this.nodoInicial == null) {
			this.nodoInicial = new Nodo<T>(valor, null);
		} else {
			Nodo<T> nodoActual = this.nodoInicial;
			
			while (nodoActual.getNodoSiguiente() != null) {
				nodoActual = nodoActual.getNodoSiguiente(); 
			}
			
			nodoActual.setNodoSiguiente(new Nodo<T>(valor, null));
		}
	}
	
	void borrar(T valor) {
		Nodo<T> nodoActual = this.nodoInicial;
		Nodo<T> nodoAnterior = null;
		
		while (nodoActual != null) {
			if (nodoActual.getValor().equals(valor)) {
				
				if (nodoAnterior == null) {
					this.nodoInicial = nodoActual.getNodoSiguiente();
				} else {
					nodoAnterior.setNodoSiguiente(nodoActual.getNodoSiguiente());
				}
			}
			nodoAnterior = nodoActual;
			nodoActual = nodoActual.getNodoSiguiente();
		}
	}
	
	boolean buscar(T valor) {
		Nodo<T> nodoActual = this.nodoInicial;
		while (nodoActual != null) {
			if (nodoActual.getValor().equals(valor)) {
				return true; 
			}
			nodoActual = nodoActual.getNodoSiguiente();
		}
		return false;
	}

	@Override
	public String toString() {
		String listaString = "[";
		
		if (this.nodoInicial != null) {
			Nodo<T> nodoActual = this.nodoInicial;
			listaString += nodoActual.getValor();
			
			while (nodoActual.getNodoSiguiente() != null) {
				nodoActual = nodoActual.getNodoSiguiente();
				listaString += ", "+nodoActual.getValor();
			}	
		}
		
		listaString += "]";
		
		return listaString;
	}
}

class Nodo<T> {
	private T valor;
	private Nodo<T> nodoSiguiente;
	
	public Nodo(T valor, Nodo<T> nodoSiguiente) {
		super();
		this.valor = valor;
		this.nodoSiguiente = nodoSiguiente;
	}
	
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public Nodo<T> getNodoSiguiente() {
		return nodoSiguiente;
	}
	public void setNodoSiguiente(Nodo<T> nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}
	
}

public class ListaLigadaEjercicio {

	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.agregar("Hola");
		lista.agregar("Carlos");
		lista.agregar("Jahir");
		
		System.out.println(lista);
		
		System.out.println(lista.buscar("No existe"));
		System.out.println(lista.buscar("Carlos"));
		System.out.println(lista.buscar("Hola"));
		System.out.println(lista.buscar("Jahir"));
		
		lista.agregar("Ultimo");
		System.out.println(lista);
		
		lista.borrar("Hola");
		System.out.println(lista);
		
		lista.borrar("Jahir");
		System.out.println(lista);
		
		lista.borrar("Ultimo");
		System.out.println(lista);
		
		lista.agregar("E");
		lista.agregar("E");
		System.out.println(lista);
		lista.borrar("E");
		System.out.println(lista);
		
	}

}
