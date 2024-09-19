package objetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("C:\\Users\\106997781\\Desktop\\Java a profundidad\\SourceCode\\15_InputsOutputs\\src\\objetos\\programadores");
		
		try(FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
			while(true) {
				try {
					Programador programador = (Programador) objectInputStream.readObject();
					System.out.println(programador.getNombre());
					System.out.println(programador.getLenguajeFavorito());
				} catch (EOFException e) {
					break;
				}
			}
		}
	}

}
