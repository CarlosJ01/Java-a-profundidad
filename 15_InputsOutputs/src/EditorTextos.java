import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EditorTextos {
	
	public static final String BASE_PATH="C:\\Users\\106997781\\Desktop\\Java a profundidad\\SourceCode\\15_InputsOutputs\\src";
	
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Nombre del archivo: ");
		String filename = readMessage();
		File file = new File(BASE_PATH.concat(File.separator).concat(filename));
		
		System.out.println("Empieza a escribir y escribe salir para terminar");
		String texto = "";
		
		try (PrintWriter printWriter = new PrintWriter(file)){
			do {
				texto =  readMessage();
				if (!"salir".equals(texto)) {
					printWriter.println(texto);
				}
			} while (!"salir".equals(texto));
		}
		
		
	}
}
