package colecciones;

import java.util.LinkedList;

public class EjemploLinkedList {
	public static void main(String[] args) {
//		Es mejor para agregar y eliminar
//		Es peor para modificar nodos y optener valores especificos
//		Puede ser una Que
		LinkedList<String> lista = new LinkedList<>();
		
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");
		lista.add("6");
		lista.add("7");
		lista.add("8");
		
		System.out.println(lista.poll()); // Quita de la cabeza
		System.out.println(lista.peek()); // Optien el primero
		
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		
		System.out.println(lista);
	}
}
