package polimorfismo.figuras;

// Si almenos existe al menos una funcion abstracta la clase debe ser abastracta
// No puede ser final (Siempre se debe poder heredar)
// Los metodos abstractos se deben implementar por sus hijos (Si o si) almenos que los hijos sean abstract
// No se pueden crear objetos 
// Pueden tener constructores  y metodos static o final
// El metodo abstracto no puede ser final ni static
// Si implementa de una interfaz, puede no implementar los metodos pero los hijos deberian

public abstract class Figura {
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
