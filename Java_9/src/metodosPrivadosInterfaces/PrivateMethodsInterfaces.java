package metodosPrivadosInterfaces;

interface Bar {
//	Publico por default
	void bar();
	
//	Metodo publico 
	default void foo() {
		foo2();	
	};
	
//	Detalle de implementacion
//	En java9 se puenden declarar metodos privados en interfaces en java 8 no existian
//	No se heredan y son pensados para ser usados por default o static
	private void foo2() {
		
	};
	
	private static void foo3() {
	};
}

public class PrivateMethodsInterfaces {

}
