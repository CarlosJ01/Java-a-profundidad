
class ExternalStatic {
	void foo() {
		System.out.println("Foo");
	}
	
//	Clase Interna Static
	static class InternalStatic {
		void bar() {
			System.out.println("Bar");
		}
	}
}

public class ClasesInternasStatic {

	public static void main(String[] args) {
//		Las static se instancian igual no necesita un objeto de la externa
		ExternalStatic.InternalStatic is = new ExternalStatic.InternalStatic();
		is.bar();
	}

}
