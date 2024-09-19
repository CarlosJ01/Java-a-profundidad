package colecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Gato {
	private String nombre;
	
	public Gato(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

// Comparator interface para ordenar, esta se implementa en otra clase que ordena la clase que se desa ordenar
// Puden crearce por lo que se desea orcenar
class OrdenamientoNombreGato implements Comparator<Gato> {

	@Override
	public int compare(Gato o1, Gato o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}

public class EjemploComparator {
	public static void main(String[] args) {
//		El comparator se manda por el constructor de la coleccion
		Set<Gato> gatos = new TreeSet<>(new OrdenamientoNombreGato());
		gatos.add(new Gato("Yuli"));
		gatos.add(new Gato("Carlota"));
		gatos.add(new Gato("Bender"));
		System.out.println(gatos);
	}
}
