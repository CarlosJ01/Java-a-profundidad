package word_static;

class SerVivo {
	SerVivo(){
		System.out.println("Constructor ser vivo");
	}
}

class Humano extends SerVivo{
//	Variable estatica, solo existe una por clase todos los objetos las comparten
	static int numeroDeHumanos = 0;
	
	String nombre;
	
	public Humano(){
		System.out.println("Constructor");
	}
	
	public Humano(String nombre){
		System.out.println("Constructor Sobrecargado");
		this.nombre = nombre;
	}
	
//	Bloque anonimo, se ejecuta cada vez que se construlle un objeto, primero se ejecuta y despues el constructor
//	almenos que herede y primero se ejecutarian las cosas del padre
//	Puedes tener mas de uno se ejecutan en orden de aparicion
	{
		System.out.println("Bloque anonimo");
		numeroDeHumanos++;
	}
	{
		System.out.println("Bloque anonimo 2");
	}
}

public class EjemploStaticEnVariables {
//	Las variables de instancia siempre requieren una isntacia u objeto
	int x = 0;
	public static void main(String[] args) {
		EjemploStaticEnVariables e = new EjemploStaticEnVariables();
		System.out.println(e.x);
		
//		Puedes llamar a las variables estaticas sin crear un objeto
		System.out.println(Humano.numeroDeHumanos);
		new Humano("Carlos");
		new Humano();
		new Humano();
		System.out.println(Humano.numeroDeHumanos);
	}

}
