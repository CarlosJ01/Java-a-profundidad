package polimorfismo.figuras;

public class PruebaDibujable {
	
	void dibujar(Dibujable dibujable) {
		dibujable.dibujar();
	}
	
	public static void main(String[] args) {
		PruebaDibujable p = new PruebaDibujable();
		p.dibujar(new Circulo("Verde", 10.5));
		p.dibujar(new Rectangulo("Verde", 10.5, 10.1));
		p.dibujar(new Imagen());
		
		System.out.println(new Imagen() instanceof Dibujable);
	}
}
