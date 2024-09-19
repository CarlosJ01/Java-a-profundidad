package excercies.excercie2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteArchivo {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\106997781\\Desktop\\Java a profundidad\\SourceCode\\16_Sockets\\src\\excercies\\excercie2\\ArchivoEnviar");
		byte[] arrayBytes = new byte[(int) file.length()];
		
		System.out.println("Leyendo archivo");
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
			bufferedInputStream.read(arrayBytes, 0, arrayBytes.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enviando archivo");
		try(Socket socket = new Socket("localhost", 1461);
				OutputStream outputStream = socket.getOutputStream()){
			
			outputStream.write(arrayBytes, 0, arrayBytes.length);
			outputStream.flush();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Archivo enviado");
	}
}
