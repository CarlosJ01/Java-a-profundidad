import java.util.Iterator;

public class Inicializacion {
	
	static void imprimirArreglo(String arreglo[]) {
		for (String string : arreglo) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
//		Explicita
		String nombres[] = new String[2];
		nombres[0] = "Carlos";
		nombres[1] = "Castro";
		imprimirArreglo(nombres);
		imprimirArreglo(new String[2]);
		
//		Implicita
		String nombres2[] = {"carlos", "castro"};
		imprimirArreglo(nombres2);
		
//		Anonima
		String nombres3[] = new String[] {"Carlos", "Castro"};
		imprimirArreglo(nombres3);
		imprimirArreglo(new String[] {"Carlos", "Castro"});
	}
}
