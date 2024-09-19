package Herencia;

public class Persona {
	String nombre;
	String fechaNacimiento;
	
	public Persona(String nombre, String fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	void dormir() {
		System.out.println("Soy "+nombre+" y estoy durmiendo");
	}

	void respirar() {
		System.out.println("Soy "+nombre+" y estoy respirando desde "+fechaNacimiento);
	}

	void comer() {
		System.out.println("Soy "+nombre+" y estoy comiendo");
	}
}
