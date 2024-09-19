package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
//		Tiene por defualt una capacidad de 10 (En el fondo son arreglos normales)
//		tiene una velocidad onstante al crescer
		
//		No es eficiente en una posicion especifica y eliminar
		ArrayList<String> array = new ArrayList<>();
//		array.add(1);
//		array.add("hola");
//		array.add(true);
//		array.add(new Object());
		
		array.add("Hola");
		array.add("Mundo");
		array.add(1, "Carlos");
		
		System.out.println(array);
	}

}
