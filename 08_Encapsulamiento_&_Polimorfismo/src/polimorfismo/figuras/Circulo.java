package polimorfismo.figuras;

public class Circulo extends Figura implements Dibujable {
	
	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	
	void rodar() {
		System.out.println("El circulo "+getColor() +"esta rodando");
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando un circulo");
	}
}
