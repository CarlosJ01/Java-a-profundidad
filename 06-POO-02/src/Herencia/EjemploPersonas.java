package Herencia;

public class EjemploPersonas {
	public static void main(String[] args) {
//		Los objetos final no pueden de cambiar las referencias
		final Estudiante e = new Estudiante("Carlos", "03-09-1998", 171208341);
		
		e.dormir();
		e.aprobar();
		e.reprobar();
	}
}
