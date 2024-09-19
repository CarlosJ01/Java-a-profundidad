package Herencia;

// Clases final no se pueden heredar
public class Estudiante extends Persona {
	int numeroCuenta;

	public Estudiante(String nombre, String fechaNacimiento, int numeroDeCuenta) {
		super(nombre, fechaNacimiento);
		this.numeroCuenta = numeroDeCuenta;
	}

	void aprobar() {
		System.out.println("Soy " + nombre + " y aprobe mi examen");
	}

	void reprobar() {
		System.out.println("Soy " + nombre + " y reprobe mi examen");
	}

//	Sobre escritura de metodos
	@Override
	void dormir() {
//      Llamar al metodo de la la clase padre		
		super.dormir();
		System.out.println("Soy "+nombre+", soy estudiante yo no duermo");
	}
	
//	This -> nosotros mismos
//	Super => Super Class o clase padre
//	metodos final no se pueden sobreescribir
}
