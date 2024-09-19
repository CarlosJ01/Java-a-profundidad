import java.util.Objects;

class Perro {
	private String nombre;
	
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Perro) {
			Perro perro = (Perro) obj;
			if (perro.getNombre().equals(this.nombre)) {
				return true;
			}
		}
		return false;
	}
	
	
}

public class OperadorVsEquals {

	public static void main(String[] args) {
		Perro p1 = new Perro("Perro");
		Perro p2 = new Perro("Perro");
		
//		Compara referencias hacia memoria
		System.out.println(p1 == p2);
//		Equals compara atributos (Se tiene que programar)
		System.out.println(p1.equals(p2));
		
		Integer x = 10;
		Integer y = 10;
		System.out.println(x==y);
		System.out.println(x.equals(y));
	}

}
