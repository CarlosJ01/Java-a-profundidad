package excercies.excercie3;

public class Cuenta {
	private float saldo = 1000.00f;
	
	public synchronized float retirar(float monto, int numeroOperacion) {
		
		float nuevoSaldo = saldo - monto;
		if (monto > 0 && nuevoSaldo >= 0) {
			this.saldo = nuevoSaldo;
			System.out.printf("[%d]: Retiro exitoso [%f] | Nuevo saldo: [%f] \n", numeroOperacion, monto, nuevoSaldo);
		} else {
			nuevoSaldo = -1;
		}
		return nuevoSaldo;
	}
}
