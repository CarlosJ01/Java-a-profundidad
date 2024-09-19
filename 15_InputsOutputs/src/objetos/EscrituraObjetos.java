package objetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraObjetos {
	public static void main(String[] args) throws IOException {
		Programador[] programadores = { 
				new Programador("Carlos", "JAVA"), 
				new Programador("Jesus", "PYTHON"), 
				new Programador("Juan", "C")
		};
		
		File file = new File("C:\\Users\\106997781\\Desktop\\Java a profundidad\\SourceCode\\15_InputsOutputs\\src\\objetos\\programadores");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		try(FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
			for (Programador programador : programadores) {
				objectOutputStream.writeObject(programador);
			}
			
		}
	}
}
