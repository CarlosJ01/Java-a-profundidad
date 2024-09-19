
public class Mascotas {
	
	public static void main(String[] args) {
		Animal gato = new Gato('G', 10);
		Animal perro = new Perro('F', 5);
		
		gato.hacerSonido();
		perro.hacerSonido();
	}
}
