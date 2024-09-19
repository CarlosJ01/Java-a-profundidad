package colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploHashMap {

	public static void main(String[] args) {
//		Objeto de valores tipo clave - valor como un JSON
		Map<String, String> diccionario = new HashMap<>();

		diccionario.put("Carlos", "Castro");
		diccionario.put("Java", "Lenguaje de progracmacion");
		diccionario.put("C", "Lenguaje del MCO");
		diccionario.put(null, "Aucensioa de un objeto");
		
//		Guarda llaves y valores, si se repite la llave remplaza el valor
		diccionario.put("Carlos", "Jahir");
		
		System.out.println(diccionario);
		for (String llave : diccionario.keySet()) {
			System.out.println(diccionario.get(llave));
		}
		
//		Entry es como si los Map fueran colecciones de entry y se puede sacar uno por uno
		for (Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
		
		/*
		 * Cuando se genera un Map genera 16 buckets o espacios, que son listas ligadas
		 * A las laves se les calcula el hashcode y se hace la funcion modular para sabeer 
		 * en que bucket va a quedar su hashcode, llave y valor.
		 * 
		 * Si chccan en el buket usan el equals para saber si son los mismos si no agrega a la lista ligada
		 * Si es el mismo lo actuliza
		 *
		 * */
	}
	
}
