package excercies.excercie1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 1. Crea un programa que a través de un socket envie un mensaje depende del mensaje el servidor imprimirá iniciando, reiniciando o apagando.

public class Servidor {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(2821);){
			while (true) {
				System.out.println("Esperando instrucciones . . .");
				
				Socket cliente = serverSocket.accept();
				System.out.printf("Cliente %s conectado \n", cliente.getInetAddress().getHostName());
				
				comando(cliente);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void comando(Socket conexion) {
		try (DataInputStream reader = new DataInputStream(conexion.getInputStream());) {
			boolean salir = false;
			while (!salir) {
				String mensaje = reader.readUTF();
				switch (mensaje) {
				case "INICIO":
					System.out.println("Iniciando ...");
					break;
				case "REINICIAR":
					System.out.println("Reiniciando ...");
					break;
				case "APAGAR":
					System.out.println("Apagando ...");
					salir=true;
					break;
				default:
					System.out.println("Comando no reconocido ...");
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
