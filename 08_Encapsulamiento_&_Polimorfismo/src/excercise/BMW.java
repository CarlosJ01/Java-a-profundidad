package excercise;

public class BMW extends Automovil{
	
	public BMW(String modelo, Integer numeroPuertas) {
		super("BMW", modelo, numeroPuertas, "Gasolina", true, false);
	}
	
	@Override
	public void encender() {
		System.out.println("Enciende manualmete");
	}

	@Override
	public void avanzar() {
		System.out.println("Consume "+this.getCombustible());
	}

}
