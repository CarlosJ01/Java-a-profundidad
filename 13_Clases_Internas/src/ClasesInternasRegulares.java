
class Externa {
	void foo() {
		System.out.println("Foo");
	}
	
//	Clase interna regular
	class Internal {
		void bar() {
			System.out.println("Bar");
		}
	}
}

public class ClasesInternasRegulares {

	public static void main(String[] args) {
		Externa e = new Externa();
		
//		Instanciar una clase internal regular
		Externa.Internal i = e.new Internal();
		e.foo();
		i.bar();
	}

}
