package polimorfismo.figuras;

public class Cuadro extends Figura{
	private double lado;

	public Cuadro(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
