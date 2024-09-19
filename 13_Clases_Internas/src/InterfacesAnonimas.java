
interface Jugable {
	void jugar();
}

public class InterfacesAnonimas {
	private void mian() {
//		Clase interna anonima de una interface
		Jugable j = new Jugable() {
			
			@Override
			public void jugar() {
				System.out.println("Jugar");
			}
		};
	}
}
