
class EjemploAnonima {
	void foo() {
		System.out.println("Foo");
	}
}

public class ClasesAnonimas {

	public static void main(String[] args) {
//		Construyendo una clase anonima que hereda de la clase que se define en el new
		EjemploAnonima ea = new EjemploAnonima() {
			@Override
			void foo() {
				System.out.println("Bar");
			}
		};
		
		ea.foo();
	}

}
