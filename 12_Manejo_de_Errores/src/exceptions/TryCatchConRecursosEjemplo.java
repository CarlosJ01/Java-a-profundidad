package exceptions;

// Los recursos que se usan con Try tienen que tener implementados
// la interface AutoCloseable
class RecurosTry implements AutoCloseable {

//	Siempre se ejecuta para liberar recursos lanze excepcion o no
	@Override
	public void close() throws Exception {
		System.out.println("Liberando Recursos");
	}
	
	void foo() {
		System.out.println("Foo");
	}
	
}

public class TryCatchConRecursosEjemplo {
	public static void main(String[] args) {
//		 En try se declaran los recursos 
	 try (RecurosTry recurso = new RecurosTry()) {
		 recurso.foo();
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
}
