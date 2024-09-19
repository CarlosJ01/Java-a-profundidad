package excercies.excercie1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {
	
	public static String readMessageConsole() throws IOException {
		System.out.printf("\n CONSOLA >> ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
	public static void main(String[] args) {
		
		try (Socket cliente = new Socket("localhost", 2821);
				DataOutputStream outputStream = new DataOutputStream(cliente.getOutputStream());){
			String mensaje = null;
			do {
				mensaje = readMessageConsole();
				outputStream.writeUTF(mensaje);
			} while (!"APAGAR".equals(mensaje));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
