
// Clase para crear hilos tiene que heredar de Thread
class Hilo extends Thread{
	public Hilo(String name) {
		super(name);
	}
	
//	Lo que ejecutara el hilo
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("Hilo %s : indice [%d] \n", getName(), i);
			try {
//				Duerme el hilo por ms
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

public class ConstruccionHilos {

	public static void main(String[] args) {
		
		Hilo hilo1 = new Hilo("1");
		Hilo hilo2 = new Hilo("2");
		
//		Llamado normal al metodo
//		hilo1.run();
//		hilo2.run();
		
//		Imicia el hilo de forma concurrente
		hilo1.start();
		hilo2.start();
	}

}
