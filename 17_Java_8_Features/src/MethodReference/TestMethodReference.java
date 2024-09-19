package MethodReference;

import java.util.Arrays;
import java.util.List;

//Funcion static
class StringUtils {
	public static boolean isUpperCase(String cad) {
		return cad.toUpperCase().equals(cad);
	}
}

class Persona{
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
}

public class TestMethodReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("alex", "juan", "CARLOS");
//		for (String name : names) {
//			System.out.println(name);
//		}
		
//		Pasando un metodo como referencia a otro para ser usada
		names.stream()
//		Metodos Estaticos
		.filter(StringUtils::isUpperCase)
//		Constructores
		.map(Persona::new)
//		Metodos de Instancia
		.forEach(System.out::println);
		
	}
}
