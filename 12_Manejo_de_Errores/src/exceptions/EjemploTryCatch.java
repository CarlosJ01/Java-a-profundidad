package exceptions;

public class EjemploTryCatch {

	public static void main(String[] args) {
//		Bloque donde se puede generar un error
		try {
			int x = 0;
			int y = 10/x;
			System.out.println("Despues del error "+y);
		} catch(Exception e) { // Bloque donde se maneja el error
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally { // Bloque se siempre se ejecuta 
			System.out.println("Siempre se ejecuta");
		}
		
		try {
			int x = 10;
			int y = 10/x;
			System.out.println("Despues del error "+y);
		} catch(Exception e) { // Bloque donde se maneja el error
			System.out.println(e.getMessage());
		}finally { // Bloque se siempre se ejecuta 
			System.out.println("Siempre se ejecuta");
		}

	}

}
