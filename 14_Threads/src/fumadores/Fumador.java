package fumadores;

import java.util.Random;

public class Fumador implements Runnable{
	
	private Almacen almacen;
	private String nombre;
	
	
	public Fumador(Almacen almacen, String nombre) {
		super();
		this.almacen = almacen;
		this.nombre = nombre;
	}


	@Override
	public void run() {
		while(true) {
			try {
				this.almacen.consume();
				System.out.printf("Fumador %s: fumo\n", this.nombre);
				try {
					Thread.sleep(new Random().nextInt(1500));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} catch (InterruptedException e) {
				System.err.printf("[%s] NO PUEDE FUMAR \n", this.nombre);
				e.printStackTrace();
			}
		}
	}
	
	
}
