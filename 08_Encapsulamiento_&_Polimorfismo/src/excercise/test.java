package excercise;

public class test {
	public static void main(String[] args) {
		Automovil tesla = new TeslaMovil("1A", 2);
		Automovil bmw = new BMW("1A", 2);
		
		tesla.encender();
		bmw.encender();
		
		tesla.avanzar();
		bmw.avanzar();
		
		tesla.apagar();
		bmw.apagar();
	}
}
