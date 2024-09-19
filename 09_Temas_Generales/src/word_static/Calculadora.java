package word_static;

public class Calculadora {
	
//	Metodos estaticos se pueden invocar sin necesidad de instancioas
	static int suma(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		System.out.println(suma(5,5));
	}

}
