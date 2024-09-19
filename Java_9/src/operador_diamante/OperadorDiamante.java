package operador_diamante;

import java.util.ArrayList;
import java.util.List;

interface Foo<T> {
	
}

public class OperadorDiamante {
	public static void main(String[] args) {
//		Operador diamante new C<>() en clases genericas X<T> = new<>X
		List<String> lista = new ArrayList<>();
		
//		Mejora en java 9 ahora se usa en clases anonimas
		Foo<Integer> foo = new Foo<>() {};
		
//		En java 8 se usaba la repeticion
//		Foo<Integer> foo8 = new Foo<Integer>() {};
	}
}
