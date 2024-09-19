package colecciones;

import java.util.TreeSet;

// Comparable Interfaz para que se pueda implementar una forma de comparar objetos cuando se usan en colecciones
class Perro implements Comparable<Perro>{
	private String nombre;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Perro p) {
//		-1 antes, 0 igual, 1 despues
		return this.nombre.compareTo(p.getNombre());
//		return p.getNombre().compareTo(this.nombre);
	}
	
}

public class EjemploComparables {
	
	public static void main(String[] args) {
		TreeSet<Perro> nombres = new TreeSet<>();
		
		nombres.add(new Perro("Carlota"));
		nombres.add(new Perro("Alfa"));
		nombres.add(new Perro("Rocky"));
		
		System.out.println(nombres);
	}
	
}
