

/*
 * 1. Crea un programa que corra en un servidor que tenga una lista de personas, el cliente debe ser capaz de leer las personas, enviar una persona nueva y modificar sus datos.
 *                       
	Todo se debe hacer de forma remota a través de sockets, si lo deseas puedes escribir un comando salir que al ejecutarlo se termine el proceso del lado del cliente y del servidor.

	Al terminar el proceso del lado del servidor la lista se debe guardar en un archivo como objetos.
 * */

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static void main(String[] args) {
		ManejadorPersonas manejadorPersonas = new ManejadorPersonas();
		boolean terminar = false;
		
		System.out.println("Inicio Servidor");
		
		try {
			manejadorPersonas.recuperarDatos();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (ServerSocket server = new ServerSocket(8000);){
			System.out.println("Esperando instrucciones ...");
			while(true) {
				Socket socket = server.accept();
				System.out.printf("Cliente %s conectado \n", socket.getInetAddress().getHostName());
				new Thread(new SesionCliente(socket, manejadorPersonas)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			manejadorPersonas.guardarDatos();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fin Servidor");
	}

		

		
		
		

	
}
