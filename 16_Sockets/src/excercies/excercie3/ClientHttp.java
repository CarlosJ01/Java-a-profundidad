package excercies.excercie3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ClientHttp {
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 8080);
				ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());){
			
			System.out.println("Construllendo Request");
			Map<String, String> headers = new HashMap<String, String>();
			headers.put("Acces", "Acceso a la BD");
			HttpRequest request = new HttpRequest(headers, "123");
			System.out.println(request);
			
			System.out.println("Envindo request . . .");
			out.writeObject(request);
			
			System.out.println("Esperando response . . .");
			HttpResponse response = (HttpResponse) in.readObject();
			System.out.println(response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
