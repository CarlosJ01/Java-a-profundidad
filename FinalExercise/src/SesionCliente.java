import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

public class SesionCliente implements Runnable{
	
	Socket socket;
	ManejadorPersonas manejadorPersonas;
	
	public SesionCliente(Socket socket, ManejadorPersonas manejadorPersonas) {
		super();
		this.socket = socket;
		this.manejadorPersonas = manejadorPersonas;
	}

	@Override
	public void run() {
		boolean salir = false;
		try(DataInputStream reader = new DataInputStream(socket.getInputStream())){
			do {
				salir = leerComando(reader);
			} while (!salir);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Cliente termino sesion");
	}
	
	private boolean leerComando(DataInputStream reader) {
		try {
			String comando = reader.readUTF().trim();
			System.out.printf("COMANDO: [%s] \n", comando);

			String[] parametros = comando.split(" ");
			if (parametros[0] != null) {
				parametros[0] = parametros[0].trim().toUpperCase();
				if ("SALIR".equals(parametros[0])) {
					return true;
				}
				if (parametros.length == 2) {
					parametros[1] = parametros[1].trim().toUpperCase();
					
					if (parametros[0].length() > 0 && parametros[1].length() > 0) {
						ejecutarComando(parametros[0], parametros[1]);
					}						
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private void ejecutarComando(String comando, String parametro) {
		switch (comando) {
		case "C":
			System.out.println("\t CREAR PERSONA: "+parametro);
			manejadorPersonas.crearPersona(parametro);
			break;
		case "A":
			if (parametro.contains(":")) {
				String[] nombres = parametro.split(":");
				if (nombres.length == 2) {
					System.out.println("\t ACTUALIZAR PERSONA: "+nombres[0]+" A "+nombres[1]);
					manejadorPersonas.actualizarPersona(nombres[0], nombres[1]);
				}
			}
			break;
		case "E":
			System.out.println("\t ELIMINAR PERSONA: "+parametro);
			manejadorPersonas.eliminarPersona(parametro);
			break;
		case "I":
			System.out.println("\tIMPRIMIR PERSONA: "+parametro);
			if (parametro.equals("TODOS")) {
				manejadorPersonas.imprimirTodos();
			} else {
				manejadorPersonas.imprimirPersona(parametro);
			}
			break;
		case "G":
			System.out.println("\tGUARDAR DATOS: "+parametro);
			if (parametro.equals("DATOS")) {
				try {
					manejadorPersonas.guardarDatos();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			break;
		default:
			System.out.println("COMANDO NO RECONOCIDO");
			break;
		}
	}
}
