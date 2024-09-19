package excercies.excercie3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/*
 * 3. Crea un programa donde el cliente pueda enviar un objeto llamado HTTPRequest que contenga los siguientes atributos:

		Body String
		
		* Headers Map<String, String>
		
		El servidor deberá responder un mensaje con los siguientes atributos:
		
		* Body String
		
		Headers Map<String, String>
		
		•HttpStatus Integer
 * */

public class ServerHttp {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(8080)){
			System.out.println("Servidor escuchando en 8080 ...");
			while(true) {
				try(Socket socket = serverSocket.accept();
						ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
						ObjectInputStream in = new ObjectInputStream(socket.getInputStream());){
					
					System.out.printf("Cliente %s conectado \n", socket.getInetAddress().getHostName());
					HttpRequest request = (HttpRequest) in.readObject();
					System.out.println(request);
					
					Map<String, String> headers = new HashMap<String, String>();
					headers.put("Consulta", "Consulta Exitosa");
					HttpResponse response = new HttpResponse(headers, "Carlos Jahir", 200);
					out.writeObject(response);
					System.out.println(response);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
