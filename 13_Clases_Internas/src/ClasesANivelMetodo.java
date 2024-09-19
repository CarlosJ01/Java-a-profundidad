public class ClasesANivelMetodo {
	
	static void foo() {
		
//		Clase interna a nivel de metodo
		class ClaseInternaMetodo {
			void bar() {
				System.out.println("Bar");
			}
		}
		
//		La clase solo existe dentro del metodo
		ClaseInternaMetodo cim = new ClaseInternaMetodo();
		cim.bar();
	}
	
	static void test() {
//		La clase solo es para un metodo
//		ClaseInternaMetodo cim = new ClaseInternaMetodo();
	}
	
	public static void main(String[] args) {
		foo();
	}

}
