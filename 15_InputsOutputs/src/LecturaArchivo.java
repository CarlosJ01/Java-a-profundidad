import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\106997781\\Desktop\\Java a profundidad\\SourceCode\\15_InputsOutputs\\src\\documento");
		if (file.exists()) {
			try (FileReader fileReader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(fileReader);
					){
				String cadena = null;
				do {
					cadena = bufferedReader.readLine();
					System.out.println(cadena);
				} while (cadena != null);
			}
		} else {
			System.out.println("EL ARCHIVO NO EXISTE");
		}
	}
}
