package simple.multiple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocket {
	
	public static String readMessage() throws IOException {
		System.out.printf("\n ->");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
	
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 8090);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());){
			String mensaje = null;
			do {
				mensaje = readMessage();
				dos.writeUTF(mensaje);
			} while (!"salir".equals(mensaje));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
}
