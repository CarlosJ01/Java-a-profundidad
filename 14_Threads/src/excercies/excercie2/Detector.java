package excercies.excercie2;

public class Detector {
	private String ganador = "";
	
	public synchronized void setGanador(String nombre) {
		if (ganador.equals("")) {
			this.ganador = nombre;			
		}
	}
	
	public void winner() {
		System.out.printf("CONTADOR [%s] GANO \n", this.ganador);
	}
	
}
