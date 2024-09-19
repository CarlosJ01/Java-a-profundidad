package excercies.excercie3;

import java.util.Random;

/*
 * 3. Simula un programa que haga transacciones bancarias donde se tengan que llevar a cabo las siguientes operaciones al retirar dinero:

		* Validar el monto recibido
		
		* Consultar saldo en la cuenta y validar si es suficiente para retirar el monto
		
		* Restar el monto al saldo
		* 
		* devolver el monto a quien invoco el método
		
		* Imprimir que se realizó el retiro con exito
		
	Ejecuta las operaciones sobre la cuenta con varios hilos sin utilizar sincronización 
	te recomendamos hacer varios retiros, después hazlo de nuevo con sincronización.
 * */

public class Excercie3 {

	public static void main(String[] args) {
		Random random = new Random();
		Cuenta cuenta = new Cuenta();
		
		for (int i = 0; i < 100; i++) {
			new OperacionRetiro((random.nextFloat() * 100), cuenta, i).start();
		}
	}
	
}
