package genericos;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericosEnMetodos {
	
//	? extends Number : Wildcard, es como una clase generica pero siempre se debe limitar por herencia 
//	se puede usar en funciones solas
//	Como decir cualquier cosa que sea un X objeto o hiljo
	static double sumarValores(List<? extends Number> valores) {
		double suma = 0;
		for (Number valor : valores) {
			suma += valor.doubleValue();
		}
		return suma;
	}
	
	public static void main(String[] args) {
		double suma = sumarValores(Arrays.asList(10.45, 11.45, 3.1416, Integer.valueOf(10), new Float(10.5f)));
		System.out.println(suma);
	}

}
