package colecciones;

import java.util.Vector;

public class EjemploVector {

	public static void main(String[] args) {
//		Es para el uso de hilos usa synchronized
		Vector<String> vector = new Vector<>();
		
		vector.add("1");
		
		System.out.println(vector);

	}

}
