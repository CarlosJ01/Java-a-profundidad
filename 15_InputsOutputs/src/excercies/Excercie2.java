package excercies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;

// 2. Programa el comando cp para copiar un archivo de un lugar a otro
// C:\Users\106997781\Desktop\Java a profundidad\SourceCode\15_InputsOutputs\src\excercies\Test.txt

public class Excercie2 {
	
	public static String readMessage(String prompt) throws IOException {
		System.out.println(prompt);
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
	
	public static void main(String[] args) throws IOException {
		String pathFile = readMessage("Archivo a copiar: ");
		String pathDestino = readMessage("Path destino: ");
		copiarArchivo(pathFile, pathDestino);
	}
	
	public static void copiarArchivo(String origen, String destino) throws FileNotFoundException, IOException {
		File fileOrigen = new File(origen);
		File fileDestino = new File(destino);
		
		if (fileOrigen.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(fileOrigen));
					PrintWriter writer = new PrintWriter(fileDestino);){
				
				String cadena = reader.readLine();
				while (cadena != null) {
					writer.println(cadena);
					cadena = reader.readLine();
				}
				
				System.out.println("ARCHIVO COPIADO");
			}
		} else {
			System.out.println("EL ARCHIVO ORIGEN NO EXISTE");
		}
	}

}
