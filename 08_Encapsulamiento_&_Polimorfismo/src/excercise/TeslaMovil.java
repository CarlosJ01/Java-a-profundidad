package excercise;

public class TeslaMovil extends Automovil{
	
	

	public TeslaMovil(String modelo, Integer numeroPuertas) {
		super("Tesla", modelo, numeroPuertas, "Electrico", false, true);
	}

	@Override
	public void encender() {
		System.out.println("Inicio remoto");
	}

	@Override
	public void avanzar() {
		System.out.println("Consume "+this.getCombustible());
	}

}
