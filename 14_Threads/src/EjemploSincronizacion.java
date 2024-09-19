class SyncCounter {
	static int counter = 10;
	
//	synchronized maneja los recursos que se comportanten por varios hilos (Solo 1 hilo accede al recurso a la vez) y no todos al mismo tiempo
	public synchronized static void decrement() {
		counter--;
		System.out.println(counter);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Decrementor extends Thread {

	@Override
	public void run() {
		System.out.println("Decrementando SyncCounter");
		SyncCounter.decrement();
	}
	
}

public class EjemploSincronizacion {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Decrementor().start();
		}
	}

}
