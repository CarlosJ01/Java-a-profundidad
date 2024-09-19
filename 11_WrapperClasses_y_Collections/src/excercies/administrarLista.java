package excercies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/*
 * 3. Crea una clase que administre
	los elementos de una lista y te
	permita agregar , borrar y buscar un
	elemento. El único requisito es que
	la lista no permita datos
	duplicados.
 */

public class administrarLista<T> {

	List<T> lista;
	
	public administrarLista() {
		super();
		this.lista = new ArrayList<T>();
	}

	void agregar(T valor) {
		if (!lista.contains(valor)) {
			lista.add(valor);			
		}
	}
	
	void eliminar(T valor) {
		lista.remove(valor);
	}
	
	boolean buscar(T valor) {
		return lista.contains(valor);
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}

	public static void main(String[] args) {
		administrarLista<Integer> lista = new administrarLista<>();
		
		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(3);
		lista.agregar(1);
		
		System.out.println(lista);
		
		System.out.println(lista.buscar(2));
		System.out.println(lista.buscar(100));
		
		lista.eliminar(2);
		System.out.println(lista);
		
		
	}

}