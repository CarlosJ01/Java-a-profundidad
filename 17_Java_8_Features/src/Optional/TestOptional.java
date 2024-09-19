package Optional;

import java.util.Optional;

public class TestOptional {
	private static String[] nombres = {"Alex", "Carlos", "Carmen"};
	
//	Clase Optional
	public static Optional<String> buscarNombre(String nombreBucar) {
		for (String nombre : nombres) {
			if (nombre.equals(nombreBucar)) {
				return Optional.of(nombre);
			}
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
//		Opcional empaqueta un valor en otra clase para menjar los null o vacios (Te obliga a manejar el caso null)
		Optional<String> result = buscarNombre("Pedro");
//		Revis si tiene valor
		if (result.isPresent()) {
			System.out.println(result.get().toUpperCase());
		}else {
			System.out.println("No se encontro");
		}
		
//		orElse asigna un valor por default si es null
		buscarNombre("Pedro").orElse("");
//		Lanzar una excepcion si esta en null
		buscarNombre("Pedro").orElseThrow(() -> new IllegalStateException("No se encontro el nombre"));
	}
}
