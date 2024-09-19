package encapsulamiento;

// Una clase no puede heredar de mas de 1 clase;
public class PruebaAbstraccion {
	public static void main(String[] args) {
		String cadena = "wasd";
		cadena.toUpperCase();
//		Los detalles de como funciona la clase (detalle de implementacion) son privados 
//		solo los que usan otros, hacen sentido a la clase son publicos. 
//		s.indexOfNonWhitespace();
	}
}

// Acoplamiento -> la dependencia de otras clases (Ideal Bajo)
// Cohhesion -> que los atributos y metodos tienen sentido para la clase (Ideal Alto)
