package exceptions;

public class EjemploMulticath {

	public static void main(String[] args) {
//		Solo el bloque try es oblicatorio
		try {
			int y = 10/1;
			System.out.println("Division : " + y);
			
			String nombre = "";
			System.out.println(nombre.toString());
			
			int arr[] = {1, 3};
			System.out.println(arr[3]);
//		Se pueden tener varis catch para diferentes excepciones que se pueden producir
//		Se pueden colocar varias clases de exception en un solo catch separandolas por un pipe |
		} catch (ArithmeticException | NullPointerException e) {
			System.err.printf("Aritmetic exception: %s", e.getMessage());
			
//	Siempre se puiede seguir usando el mas generico usando polimorfismo
		} catch (Exception e) {
				System.err.printf("Exception: %s \n", e.getMessage());
		} finally {
			System.out.println("Siempre entro");
		}
	}

}
