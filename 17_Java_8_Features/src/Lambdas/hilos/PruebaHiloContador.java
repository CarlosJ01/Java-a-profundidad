package Lambdas.hilos;

public class PruebaHiloContador {
	public static void main(String[] args) {
//		Hilo normal
		Thread hilo = new Thread(new HiloContador());
		hilo.start();
		
//		Hilo con lambdas
		Runnable hiloLambdas = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread hilo2 = new Thread(hiloLambdas);
		hilo2.start();
	}
}
