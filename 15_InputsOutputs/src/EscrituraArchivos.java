import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraArchivos {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\106997781\\Desktop\\Java a profundidad\\SourceCode\\15_InputsOutputs\\src\\documento");
		try (PrintWriter printWriter = new PrintWriter(file)){
			printWriter.println("Hola mundo");
			printWriter.println("Soy Carlos");
			printWriter.close();
		}
	}
	
}
