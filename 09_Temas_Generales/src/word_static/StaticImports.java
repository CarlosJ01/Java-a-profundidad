package word_static;

// Siempre lo importa es codigo implicito
import java.lang.*;

// Importacion estatico es como si la funcion siempre este ahi sin Math o la clase
// declaro todo lo estatico de un paquete
import static java.lang.Math.sqrt;

public class StaticImports {
	public static void main(String[] args) {
		System.out.println(sqrt(25));
	}
}
