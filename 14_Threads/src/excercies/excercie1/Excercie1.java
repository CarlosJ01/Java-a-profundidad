package excercies.excercie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//1. Crea un programa donde un hilo haga una cuenta
//	regresiva dado un número, el tiempo que debe esperar
//	el hilo debe ser aleatorio. Inicia 10 hilos y revisa
//	que hilo termino primero, asegurate de colocar le un
//	nombre a cada uno de ellos.

public class Excercie1 {

	public static void main(String[] args) {
		Random random = new Random();
		Detector detector = new Detector();
		
		List<Thread> contadores = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Thread contador = new Thread(new Contador(random.nextInt(10), random.nextInt(2000), detector), ""+i);
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
