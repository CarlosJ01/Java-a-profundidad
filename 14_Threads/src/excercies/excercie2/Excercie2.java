package excercies.excercie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * 2. Modifica el programa anterior para que todos los
	hilos esperen el mismo tiempo asignale diferentes
	prioridades a cada uno de ellos y lanza 30 hilos,
	revisa si el cambio de prioridad generó al gún cambio.
 * 
 * */
public class Excercie2 {

	public static void main(String[] args) {
		Random random = new Random();
		Detector detector = new Detector();
		
		List<Thread> contadores = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			Thread contador = new Thread(new Contador(10, detector), ""+i);
			if (i == 0) {
				contador.setPriority(10);
			} else {
				contador.setPriority(random.nextInt(8)+1);			
			}
			contador.start();
			contadores.add(contador);
		}
		
		contadores.forEach(contador -> {
			try {
				contador.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		detector.winner();
	}
	
}
