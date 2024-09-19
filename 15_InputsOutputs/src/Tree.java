import java.io.File;

public class Tree {
	
	public static void print(File[] files, String tabs) {
		String spaces = tabs.concat("-");
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.printf("%s %s \n", spaces, file.getName());
				} else {
					System.out.printf("%s %s \n", spaces, file.getName());
					print(file.listFiles(), spaces);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		File rootDir = new File("C:\\Users\\106997781\\Documents\\Checkpoint");
		System.out.println(rootDir.getName());
		print(rootDir.listFiles(), "-");
	}
	
	
}
