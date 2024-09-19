package colecciones;

import java.util.HashSet;
import java.util.TreeSet;

public class EjemploTreeSet {

	public static void main(String[] args) {
//		Solo elementos unicos y los ordenas alfabeticamente o natural
		TreeSet<String> nombres = new TreeSet<>();
		
		nombres.add("Carlos");
		nombres.add("Jahir");
		nombres.add("Carlos");
		nombres.add("Alex");
		
		System.out.println(nombres.add("Carlos"));
		System.out.println(nombres);

	}

}
