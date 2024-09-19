package colecciones;

import java.util.HashSet;

public class EjemploHashSet {

	public static void main(String[] args) {
//		No admite objetos repetidos. no le importa el orden
//		solo objetos unicos
		HashSet<String> nombres = new HashSet<>();
		
		nombres.add("Carlos");
		nombres.add("Jahir");
		nombres.add("Carlos");
		nombres.add(null);
		
		System.out.println(nombres.add("Carlos"));
		System.out.println(nombres);
	}

}
