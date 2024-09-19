package colecciones;

import java.util.TreeMap;

public class TreeMapEjemplo {

	public static void main(String[] args) {
//		Se ordena a corde de un orden natural en la llave
		TreeMap<String, Integer> mapa = new TreeMap<>();
		
		mapa.put("Z", 1);
		mapa.put("A", 100);
		mapa.put("B", -100);
		
		
		System.out.println(mapa);
		
	}

}
