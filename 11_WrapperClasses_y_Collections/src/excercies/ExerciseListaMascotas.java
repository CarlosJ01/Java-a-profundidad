package excercies;

import java.util.ArrayList;

class Mascota {
	private String nombre;
	private String especie;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", especie=" + especie + "]";
	}
}

class Perro extends Mascota{
	Perro(String nombre){
		this.setNombre(nombre);
		this.setEspecie("PERRO");
	}
}

class Gato extends Mascota{
	Gato(String nombre){
		this.setNombre(nombre);
		this.setEspecie("GATO");
	}
}
public class ExerciseListaMascotas {
	public static void main(String[] args) {
		ArrayList<Mascota> mascotas = new ArrayList<>();
		
		mascotas.add(new Perro("Solobino"));
		mascotas.add(new Gato("Yuli"));
		mascotas.add(new Gato("Carlota"));
		
		System.out.println(mascotas);
	}
}
