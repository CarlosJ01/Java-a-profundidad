package Lambdas.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaComparator {
	
	public static void main(String[] args) {
//		Normal
//		NombrePersonaComparator nombrePersonaComparator = new NombrePersonaComparator();
//		Set<Persona> personas = new TreeSet<>(nombrePersonaComparator);
		
//		Clase anonima
//		Comparator<Persona> comparatorEdad = new Comparator<Persona>() {
//			@Override
//			public int compare(Persona o1, Persona o2) {
//				return o1.getEdad().compareTo(o2.getEdad());
//			}
//		};
		
//		Lambdas para comparar remplazan clases anonimas y classes para interfaces funcionales.
		Comparator<Persona> comparator = (Persona p1, Persona p2) -> p1.getApellido().compareTo(p2.getApellido());
		Set<Persona> personas = new TreeSet<>(comparator);

		personas.add(new Persona("Juan", "Lopez", 32));
		personas.add(new Persona("Arturo", "Sanchez", 32));
		personas.add(new Persona("Alex", "Bautista", 32));
		
		System.out.println(personas);
	}
	
}
