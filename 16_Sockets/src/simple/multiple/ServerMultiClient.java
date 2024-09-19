package simple.multiple;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class WorkedSocket extends Thread {
	private Socket client;

	public WorkedSocket(Socket client) {
		super();
		this.client = client;
	}
	
	@Override
	public void run() {
		try (DataInputStream reader = new DataInputStream(client.getInputStream());) {
			String mensaje;
			do {
				mensaje = reader.readUTF();
				System.out.printf("%s: dice [%s] \n", client.getInetAddress().getHostName(), mensaje);
			} while (!"salir".equals(mensaje));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
}

public class ServerMultiClient {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(8090);){
			System.out.println("Escuchando mensajes");
			while (true) {
				System.out.println("...");
				
				Socket cliente = server.accept();
				System.out.printf("Cliente %s conectado \n", cliente.getInetAddress().getHostName());
				new WorkedSocket(cliente).start();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
