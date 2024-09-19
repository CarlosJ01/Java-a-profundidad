package modificadores;

class Prueba {
//	Privado solo puede acceder dentro de la misma clase
	private String nombre;
	
	void test(){
		nombre = "Carlos";
	}
	
	private Prueba() {
		System.out.println("Hay constructores privados");
	}
}

public class EjemploPrivate {

	public static void main(String[] args) {
//		Prueba p = new Prueba();
//		p.nombre = "1alex";
//		p.test();
	}

}
