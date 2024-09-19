package excercies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// 3. Programa el comando mv para mover un archivo de un lugar a otro.
// C:\Users\106997781\Desktop\Java a profundidad\SourceCode\15_InputsOutputs\src\excercies\Test.txt

public class Excercie3 {
	
	public static String readMessage(String prompt) throws IOException {
		System.out.println(prompt);
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
	
	public static void main(String[] args) throws IOException {
		String pathFile = readMessage("Archivo a mover: ");
		String pathDestino = readMessage("Path destino: ");
		moverArchivo(pathFile, pathDestino);
	}
	
	public static void moverArchivo(String origen, String destino) throws FileNotFoundException, IOException {
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
			}
			
			if (fileOrigen.delete()) {
				System.out.println("ARCHIVO MOVIDO");					
			}
			
		} else {
			System.out.println("EL ARCHIVO ORIGEN NO EXISTE");
		}
	}
}
