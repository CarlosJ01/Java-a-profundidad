package excercies;

import java.io.File;
import java.util.Date;

// 1. Programa el comando dir para listar los archivos en un directorio especificado

public class Excercie1 {
	
	public static void main(String[] args) {
		
		File directorio = new File("C:\\Users\\106997781");
		
		System.out.println("Directory of "+directorio.getPath());
		
		File[] files = directorio.listFiles();
		int numFiles = 0;
		int numDir = 0;
		int bytesFiles = 0;
		
		for (File file : files) {
			
			if (file.isFile()) {
				numFiles++;
				bytesFiles += file.length();
			} else if (file.isDirectory()){
				numDir++;
			}
			
			System.out.printf(
					"[%s] \t%s \t%s \t%s \n", 
					new Date(file.lastModified()),
					file.isDirectory() ? "<DIR>": "     ",
					file.isFile() ? file.length() : "",
					file.getName()
			);
		}
		
		System.out.println("--------------------------------------------------");
		System.out.printf("%d File(s) \t %d bytes\n", numFiles, bytesFiles);
		System.out.printf("%d Dir(s) \n", numDir);
		
	}

}
