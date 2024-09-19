import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ManejadorPersonas {
	
	private List<Persona> personas = new ArrayList<>();
	private final String FILE_PERSONAS = "personas_backup";
	
	public synchronized void crearPersona(String nombre) {
		personas.add(new Persona(nombre));
	}
	
	public synchronized void actualizarPersona(String nombre, String nuevoNombre) {
		Persona persona = getPersona(nombre);
		if (persona != null) {
			persona.setNombre(nuevoNombre);
		}else {
			System.out.println("\t PERSONA NO ENCONTRADA");
		}		
	}
	
	public synchronized void eliminarPersona(String nombre) {
		personas.remove(new Persona(nombre));
	}
	
	public synchronized void imprimirPersona(String nombre) {
		Persona persona = getPersona(nombre);
		if (persona != null) {
			System.out.println("\t"+persona);
		}else {
			System.out.println("\t PERSONA NO ENCONTRADA");
		}
	}
	
	public synchronized void imprimirTodos() {
		for (Persona persona : personas) {
			System.out.println("\t"+persona);
		}
	}
	
	private Persona getPersona(String nombre) {
		for (Persona persona : personas) {
			if (persona.getNombre().equals(nombre)) {
				return persona;
			}
		}
		return null;
	}

	public void recuperarDatos() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File(FILE_PERSONAS);
		if (file.exists()) {
			try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));) {
				Persona persona = null;
				while(true) {
					try {
						persona = (Persona) inputStream.readObject();
						personas.add(persona);
					} catch (EOFException e) {
						break;
					}
				}
			}
			System.out.println("DATOS RECUPERADOS DEL BACKUP :"+FILE_PERSONAS);
		}else {
			System.out.println("ARCHIVO BACKUP NO EXISTE");
		}
		
	}

	public synchronized void guardarDatos() throws FileNotFoundException, IOException {
		File file = new File(FILE_PERSONAS);
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
			for (Persona persona : personas) {
				outputStream.writeObject(persona);
			}
		}
		
		System.out.println("DATOS GUARDADOS EN : "+FILE_PERSONAS);
	}
	
}
