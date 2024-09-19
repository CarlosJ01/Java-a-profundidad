package fumadores;

import java.util.LinkedList;

import fumadores.insumos.Cerillo;
import fumadores.insumos.Cigarro;
import fumadores.insumos.Papel;
import fumadores.insumos.Tabaco;

public class Almacen {
	
	private LinkedList<Cerillo> cerillos = new LinkedList<>();
	private LinkedList<Papel> papeles = new LinkedList<>();
	private LinkedList<Tabaco> tabacos  = new LinkedList<>();
	
	private LinkedList<Cigarro> cigarros  = new LinkedList<>();
	
	public synchronized Cigarro consume() throws InterruptedException {
		while(this.cigarros.isEmpty()) {
			wait();
		}
		return cigarros.poll();
	}
	
	public synchronized <T> void produce(T insumo) {
		
		// Resibir insumos
		if (insumo instanceof Cerillo) {
			cerillos.offer((Cerillo) insumo);
		} else if (insumo instanceof Papel) {
			papeles.offer((Papel) insumo);
		} else if (insumo instanceof Tabaco) {
			tabacos.offer((Tabaco) insumo);
		}
		
		this.checkInventarios();
	}
	
	private void checkInventarios() {
		// Verificar que hay insumos de todos los tipos, crear un cigarro
		if (cerillos.size() > 0 && papeles.size() > 0 && tabacos.size() > 0) {
			Cerillo cerillo = cerillos.poll();
			Papel papel = papeles.poll();
			Tabaco tabaco = tabacos.poll();
			
			Cigarro cigarro = new Cigarro(cerillo, tabaco, papel);
			cigarros.offer(cigarro);
			System.out.printf("Cigarro no [%d] creado\n", this.cigarros.size());
			
			notifyAll();
		}
	}
}
