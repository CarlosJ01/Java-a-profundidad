package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Hay muchos metodos estaticos para trabajar con colleciones
public class EjemploCollections {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		
		
		nombres.add("Fatima");
		nombres.add("Carlos");
		nombres.add("Lupita");
		System.out.println(nombres);
		
//		Ordenar una colecccion
		Collections.sort(nombres);
		System.out.println(nombres);
		
//		Busca un elemento debuelve el index (La lista debe estar ordenada)
		int index = Collections.binarySearch(nombres, "Carlos");
		System.out.println(nombres.get(index));
	}

}
