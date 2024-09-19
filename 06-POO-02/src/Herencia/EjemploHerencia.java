package Herencia;
class Animal {
	String nombre;
	public void respirar() {
		System.out.println("Soy un animal y estoy respirando");
	}
}

// Herencia
class Perro extends Animal{
	
}

class Gato extends Animal{
	
}

public class EjemploHerencia {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		Perro p = new Perro();
		p.nombre = "Perro";
		p.respirar();
		
		Gato g = new Gato();
		g.respirar();
		
		// Un objeto es una instancia de una clase		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Object);
		System.out.println(a instanceof Perro);
		System.out.println(a instanceof Gato);
		
		System.out.println(p instanceof Animal);
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Perro);
	}
}
