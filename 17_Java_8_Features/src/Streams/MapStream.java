package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Alumno {
	private String nombre;

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}

public class MapStream {
	public static void main(String[] args) {
		List<Alumno> alumnos = Arrays.asList(new Alumno("Juan"), new Alumno("Pedro"), new Alumno("Juan"));
//		Map de mapear un stream a otro
		List<String> nombres = alumnos.stream().map(a -> a.getNombre()).collect(Collectors.toList());
		System.out.println(alumnos);
		System.out.println(nombres);
		
		List<Alumno> alumnos2 = nombres.stream().map(n -> new Alumno(n)).collect(Collectors.toList());
		System.out.println(alumnos2);
	}
}
