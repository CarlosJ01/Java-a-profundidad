package excercies.excercie2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 2. Crea un programa donde el cliente pueda enviar un archivo al servidor

public class ServidorArchivos {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(1461);
			System.out.println("Esperando archivo . . .");
			
			Socket socket = serverSocket.accept();
			InputStream inputStream = socket.getInputStream();
			
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
					new FileOutputStream("C:\\Users\\106997781\\Desktop\\Java a profundidad\\SourceCode\\16_Sockets\\src\\excercies\\excercie2\\archivoRecivido")
					);
			byte[] buffer = new byte[1024];
			int bytesRead;
			
			System.out.println("Descargando archivo . . .");
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				bufferedOutputStream.write(buffer, 0, bytesRead);
	        }
			
			System.out.println("Archivo Recibido . . .");
			bufferedOutputStream.close();
	        socket.close();
	        serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
