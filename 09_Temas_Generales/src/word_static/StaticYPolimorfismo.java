package word_static;

class A {
	static void foo() {
		System.out.println("Foo");
	}
}

class B extends A {
	
//	Los metodos estaticos no se pueden sobreescribir por normales
	static void foo() {
		System.out.println("Foo 2");
	}
}

public class StaticYPolimorfismo {
	public static void main(String[] args) {
		A a = new B();
//		Se invoca el statico de la referencia en este caso (A)
		a.foo();
		
		
		
		
	}
}
