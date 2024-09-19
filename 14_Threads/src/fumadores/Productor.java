package fumadores;

import java.util.Random;

import fumadores.insumos.Cerillo;
import fumadores.insumos.Papel;
import fumadores.insumos.Tabaco;

public class Productor<T> extends Thread {
	
	private Almacen almacen;
	private String tipo;
	
	public static final String CERILLO = "Cerillos";
	public static final String PAPEL = "Papel";
	public static final String TABACO = "Tabaco";

	public Productor(Almacen almacen, String nombre, String tipo) {
		super(nombre);
		this.almacen = almacen;
		this.tipo = tipo;
	}

	@Override
	public void run() {
		while(true) {
			T insumo = crearInsumo();
			almacen.produce(insumo);
			System.out.printf("Productor: %s, creo [%s]\n", this.getName(), insumo);
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private T crearInsumo() {
		T insumo = null;
		switch (tipo) {
			case CERILLO:
				insumo = (T) new Cerillo();
				break;
			case PAPEL:
				insumo = (T) new Papel();
				break;	
			case TABACO:
				insumo = (T) new Tabaco();
				break;
			default:
				break;
		}
		return insumo;
	}
	
}
