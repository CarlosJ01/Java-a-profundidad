package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		List<Persona> personas = Arrays.asList(
				new Persona("Carlos", 26),
				new Persona("Miku", 16),
				new Persona("Maria", 20),
				new Persona("Martin", 52));
		
//		Solucion imperativa
//		List<Persona> result = new ArrayList<>();
//		int count = 0;
//		for (Persona persona : personas) {
//			if (persona.getEdad() >= 18) {
//				result.add(persona);
//				count++;
//			}
//			if (count == 3) {
//				break;
//			}
//		}
//		System.out.println(result);
		
//		Solucion con Streams
		List<Persona> resultado = personas.stream()
			.filter((persona) -> persona.getEdad() >= 18)
			.limit(3)
			.collect(Collectors.toList());
		System.out.println(resultado);
	}
}
