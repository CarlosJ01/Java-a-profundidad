package word_static;

public class BloquesEstaticos {
	
//	Bloque estatico, siempre se ejecuta cuando se carga la clase en la JVM
	static {
		System.out.println("Hola mundo");
	}
	
//	Puede ver mas de uno se ejecutan en orden de aparicion
	static {
		System.out.println("Hola mundo 2");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
}
