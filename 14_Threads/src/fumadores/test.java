package fumadores;

import fumadores.insumos.Cerillo;

/*
 * Programa el algoritmo de los hilos fumadores, debes de tener 3 hilos que son los fumadores ellos necesitan 3 cosas para fumar, papel, tabaco y cerillos. 
 * A demás debes tener 3 hilos productores cada uno producirá un material diferente una vez que se encuentren los 3 materiales notifica a los hilos 
 * que pueden ir por sus materiales para fumar, si no hay materiales los hilos fumandores se deben ir a un estado waiting
 */

public class test {
	public static void main(String[] args) {
		Almacen almacen = new Almacen();
		
		Productor<Cerillo> productorCerillo1 = new Productor<>(almacen, "Cerillo 1", Productor.CERILLO);
		Productor<Cerillo> productorCerillo2 = new Productor<>(almacen, "Cerillo 2", Productor.CERILLO);
		Productor<Cerillo> productorCerillo3 = new Productor<>(almacen, "Cerillo 3", Productor.CERILLO);
		Productor<Cerillo> productorPapel1 = new Productor<>(almacen, "Papel 1", Productor.PAPEL);
		Productor<Cerillo> productorPapel2 = new Productor<>(almacen, "Papel 2", Productor.PAPEL);
		Productor<Cerillo> productorPapel3 = new Productor<>(almacen, "Papel 3", Productor.PAPEL);
		Productor<Cerillo> productorPapel4 = new Productor<>(almacen, "Papel 4", Productor.PAPEL);
		Productor<Cerillo> productorTabaco1 = new Productor<>(almacen, "Tabaco 1", Productor.TABACO);
		Productor<Cerillo> productorTabaco2 = new Productor<>(almacen, "Tabaco 2", Productor.TABACO);
		
		Thread fumador1 = new Thread(new Fumador(almacen, "1"));
		Thread fumador2 = new Thread(new Fumador(almacen, "2"));
		Thread fumador3 = new Thread(new Fumador(almacen, "3"));
		
		productorCerillo1.start();
		productorCerillo2.start();
		productorCerillo3.start();
		productorPapel1.start();
		productorPapel2.start();
		productorPapel3.start();
		productorPapel4.start();
		productorTabaco1.start();
		productorTabaco2.start();
		
		fumador1.start();
		fumador2.start();
		fumador3.start();
	}
}
