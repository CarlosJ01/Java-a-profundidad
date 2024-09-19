package exceptions;

// Reglas
//	Throws es solo requerido para Check Exception
// No se puede agregar throws a metodos sobrescritos
// Throw detiene las ejecucion y lanza la exception
// Si la exception no es manejada llegara hasta main y sera manejada por la VJM
// Se puede poner unalista de Exception en throws
// Throw solo puede lanzar opbjetos throwable

class Foo {
	void print() throws Exception{
		
	}
}
class Bar extends Foo {
	@Override
	void print() throws Exception {
		
	}
}

public class ReglasTrhows {
	public static void main(String[] args) {
		
	}
}
