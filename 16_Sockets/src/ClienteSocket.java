import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteSocket {
	public static void main(String[] args) throws UnknownHostException, IOException {
		try (Socket socket = new Socket("localhost", 8090);
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream())){
			dataOutputStream.writeUTF("Hola soy un cliente del socktet");
			dataOutputStream.writeUTF("salir");
		}
		System.out.println("MENSAJE ENVIADO");
	}
}
