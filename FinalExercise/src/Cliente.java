import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		
		try (Socket cliente = new Socket("localhost", 8000);
				DataOutputStream outputStream = new DataOutputStream(cliente.getOutputStream());){
			String mensaje = null;
			System.out.println("Iniciando cliente");
			do {
				mensaje = readMessageConsole();
				outputStream.writeUTF(mensaje);
			} while (!"salir".equals(mensaje));
			System.out.println("Termino Cliente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String readMessageConsole() throws IOException {
		System.out.printf("CONSOLA >> ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine().trim();
	}

}
