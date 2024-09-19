
abstract class figuraAnonima {
	abstract void foo();
}

public class EjemploAnonimasAbstractas {

	public static void main(String[] args) {
//		Clases anonimas
		figuraAnonima fa = new figuraAnonima() {
			
			@Override
			void foo() {
				System.err.println("Foo");
			}
		};
		
		fa.foo();
	}

}
