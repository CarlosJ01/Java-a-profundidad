import java.io.File;

public class EjemploFiles {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\106997781\\Documents\\Checkpoint");

		System.out.println("Is file: "+file.isFile());
		System.out.println("Is Directori: "+file.isDirectory());
		System.out.println("Name: "+file.getName());
		System.out.println("Can read: "+file.canRead());
		
//		Sacar un arreglo de los files de un directorio
		File[] files = file.listFiles();
		
		for (File content : files) {
			System.out.println("---------------------------------------------");
			System.out.println("Is file: "+content.isFile());
			System.out.println("Is Directori: "+content.isDirectory());
			System.out.println("Name: "+content.getName());
			System.out.println("Can read: "+content.canRead());
		}
	}
}
