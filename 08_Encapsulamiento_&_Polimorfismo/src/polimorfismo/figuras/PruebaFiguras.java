package polimorfismo.figuras;

public class PruebaFiguras {
	
	void imprimirArea(Figura figura) {
		System.out.println("El color de la figura es "+figura.getColor()+" y tiene un area de "+figura.calcularArea());
	}
	
	public static void main(String[] args) {
		PruebaFiguras p = new PruebaFiguras();
		p.imprimirArea(new Circulo("Rojo", 10.0));
		p.imprimirArea(new Cuadro("Verde", 125.2));
		p.imprimirArea(new Rectangulo("Azul", 20.0, 10.0));
	}
}
