package polimorfismo.figuras;

public class Rectangulo extends Figura implements Dibujable{
	private double base;
	private double altura;
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dibujar() {
		System.out.println("Dijando Rectangulo");
	}
	
}
