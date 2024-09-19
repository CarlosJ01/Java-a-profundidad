package excercies.excercie3;

public class OperacionRetiro extends Thread{
	
	private Cuenta cuenta;
	private float monto;
	private int numero;
	
	public OperacionRetiro(float monto, Cuenta cuenta, int numero) {
		super();
		this.monto = monto;
		this.cuenta = cuenta;
		this.numero = numero;
	}
	
	@Override
	public void run() {
		float resultado = cuenta.retirar(monto, numero);
		
		if (resultado == -1) {
			System.err.println("["+numero+"]: No se pudo hacer el retiro ["+monto+"]");
		}
	}
}
