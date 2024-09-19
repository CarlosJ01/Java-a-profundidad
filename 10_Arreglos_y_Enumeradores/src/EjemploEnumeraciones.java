
// Arreglo de constantes, como una clase que tiene objetos constantes de default
// Serie de constantes agrupadas que tambien son objetos de la clase o enum.
enum saborPalomitas{
	CHILE("Chile", 5), MATEQUILLA("Mantequilla", 1), QUESO("Quedito", 3);
	
	private String nombreDeVenta;
	private float precio;
	
	private saborPalomitas(String nombreDeVenta, float precio) {
		this.nombreDeVenta = nombreDeVenta;
		this.precio = precio;
	}

	public String getNombreDeVenta() {
		return nombreDeVenta;
	}
	
	public float getPrecio() {
		return precio;
	}
	
}

public class EjemploEnumeraciones {
	public static void main(String[] args) {
		saborPalomitas sp = saborPalomitas.CHILE;
		System.out.println(sp.name());
		System.out.println(sp.getNombreDeVenta());
		System.out.println(sp.getPrecio());
	}
}
