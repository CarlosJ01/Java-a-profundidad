package exceptions;

public class EjemploThrow {
	
//	Propagandola hasta main el que la maneja es la  JVM
//	Throws indica que la responsabilidad de manejar la excepcion es de quien lo invoco
//	En teoria propagando el error hasta el componente que puede manejarlo


	public static void main(String[] args) throws Exception{
//		Se puede atrapar la exception o propagarla mas adelante
		try {
			double resultado = dividir(10, 0);			
		} catch (Exception e) {
			
		}
	}
	
//	Throws indica que este metodo puede lanzar exception check entonces se tiene que manejar mas adelante
//	Propagando la exception y atrapandola con try catch mas delante
	static double dividir(int x, int y) throws Exception{
		if (y != 0) {
			return x/y;
		}
//		Throw lanza una excepcion a peticion, todas las runetimeexception son uncheck
//		throw new IllegalArgumentException("No se puede dividir entre cero");
		throw new Exception("No se puede dividir entre cero");
	}
	
}
