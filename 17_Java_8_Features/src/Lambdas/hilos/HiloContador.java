package Lambdas.hilos;

import java.util.Iterator;

public class HiloContador implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
