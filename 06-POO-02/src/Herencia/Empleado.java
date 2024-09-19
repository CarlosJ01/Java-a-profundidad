package Herencia;

public class Empleado extends Persona {
	float sueldo;

	public Empleado(float sueldo, String nombre, String fechaNacimiento) {
		super(nombre, fechaNacimiento);
		this.sueldo = sueldo;
	}

	void trabajar() {
		System.out.println("Soy " + nombre + " y trabajo");
	}

	void cobrar() {
		System.out.println("Soy " + nombre + " y estoy cobrando " + sueldo);
	}
}
