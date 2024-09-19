import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {

	public static void main(String[] args) throws IOException {
		
		ServerSocket socket = new ServerSocket(8090);
		System.out.println("Escuchando peticiones ...");
		
		Socket cliente = socket.accept();
		System.out.printf("Cliente %s conectado \n", cliente.getInetAddress().getHostName());
		
		DataInputStream dataInputStream = new DataInputStream(cliente.getInputStream());
		String mensaje;
		do {
			mensaje = dataInputStream.readUTF();
			System.out.printf("%s: dice [%s] \n", cliente.getInetAddress().getHostName(), mensaje);
		} while (!"salir".equals(mensaje));
		
		System.out.println("Conexion Cerrada");
		socket.close();
		cliente.close();
		dataInputStream.close();
	}

}
