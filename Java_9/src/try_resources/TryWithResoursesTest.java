package try_resources;

import java.io.InputStreamReader;

public class TryWithResoursesTest {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
//		En java 9 se  puede usar el Try with resourses con varibles que se declaran afuera del bloque
		try (isr){
			
		} catch (Exception e) {
			isr.toString();
		}
		
//		En java 8 no se podia
//		try (InputStreamReader isr2 = new InputStreamReader(System.in);){
//			
//		} catch (Exception e) {
//			isr2.toString();
//		}
	}
}
