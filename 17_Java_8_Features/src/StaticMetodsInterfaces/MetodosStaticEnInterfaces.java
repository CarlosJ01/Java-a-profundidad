package StaticMetodsInterfaces;

interface Follower{
//	Metodos en interfaces con implementacion, no son sobreescritos
//	Se puede invocar sin instancia
	static void print() {
		System.out.println("Esto es un metodo static en una interfaz");
	}
	
//	Metodo default para un metodo que puede tener implementacion este se puede sobrescribir
//	No se puede invocar sin una instancia
	default void follow() {
		System.out.println("Esto es un metodo generico");
	}
}

class TwitterFollower implements Follower {
	
//	no se puede sobre escribir
//	private void print() {
//		// TODO Auto-generated method stub
//
//	}
	
	
}

public class MetodosStaticEnInterfaces {
	public static void main(String[] args) {
		Follower.print();
		new TwitterFollower().follow();
	}
}
