
class Taco {
	private String sabor;
	private float precio;
	
	public Taco(String sabor, float precio) {
		super();
		this.sabor = sabor;
		this.precio = precio;
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}

public class ArreglosObjetos {
	
	public static void main(String[] args) {
//		Taco orden[] = new Taco[3];
//		orden[0] = new Taco("Suadero", 20);
//		orden[1] = new Taco("Pastor", 10);
//		orden[2] = new Taco("Chorizo", 15);
		
//		Taco orden[] = {
//				new Taco("Suadero", 20),
//				new Taco("Pastor", 10),
//				new Taco("Chorizo", 15)
//		};
		
		Taco orden[] = new Taco[]{
				new Taco("Suadero", 20),
				new Taco("Pastor", 10),
				new Taco("Chorizo", 15)
		};
		
		Taco orden2[][] = {{}, {}};
				
		for (Taco taco : orden) {
			System.out.println("Sabor: "+taco.getSabor());
			System.out.println("Precio: "+taco.getPrecio());
		}
	}
	
}
