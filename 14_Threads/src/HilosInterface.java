
// Interface para implementar hilos
class Counter implements Runnable {
	
	private int valor;
	
	public Counter(int valor) {
		super();
		this.valor = valor;
	}



	@Override
	public void run() {
		System.out.printf("Estado %s \n", Thread.currentThread().getState());
		for (int i = valor; i >= 0; i--) {
			System.out.printf("%s: Valor [%d] \n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class HilosInterface {

	public static void main(String[] args) throws InterruptedException {
//		Se pasa a un objeto hilo la instancia de la clase que implementa runnalable
		Thread hilo1 = new Thread(new Counter(10), "Contador 1");
		Thread hilo2 = new Thread(new Counter(20), "Contador 2");
		System.out.printf("Estado %s \n", hilo1.getState());
		hilo1.start();
		System.out.printf("Estado %s \n", hilo1.getState());
		hilo2.start();
		System.out.println("Se lanzaron los hilos");
		hilo1.join(); // Une la ejecuecion del hilo al hilo actual (main)
		hilo2.join(); // o es un espera a que termine el hilo entonce sigue
		System.out.println("Fin"); // Se ejecuta hasta que termine los hilos por el join
		
		System.out.printf("Estado %s \n", hilo1.getState());
//		hilo1.start(); // Una vez el hilo ejecutado o muerto no se puede volver a ejecutar
	}
	
}
