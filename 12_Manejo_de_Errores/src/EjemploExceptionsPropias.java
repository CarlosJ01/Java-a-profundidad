
class TituloIncorrectoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 11233412L;
	
	TituloIncorrectoException(String error){
		super(error);
	}
	
	
}

public class EjemploExceptionsPropias {
	
	/*
	 * Si el nombre del curso no esta en mayusculas es incorrecto
	 */
	static void crearCurso(String titulo) throws TituloIncorrectoException {
		if (!titulo.toUpperCase().equals(titulo)) {
			throw new TituloIncorrectoException("El titulo debe estar en mayusculas");
		}
		System.out.println("Titulo correcto");
	}
	
	public static void main(String[] args) {
		try {
			crearCurso("JAVA DESDE CERO");
			crearCurso("Java");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
