package exceptions;

public class ReglasTryCatchFinally {

	public static void main(String[] args) {
//		Solo el bloque try es obligatorio peude exister con catch o finally
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			
		} finally {
			// TODO: handle finally clause
		}
//	Bloques completos
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
//		Finally se ejecuta siempre aunque catch tenga un return al menos con un system.exit() que termina el programa
		} finally {
			
		}
		
		try {
//		Se puede tener varios bloques catch pero solo uno se ejecutara
//		del mas especifico al mas general
		} catch (Exception e) {
			// TODO: handle exception
		} catch (Throwable e) {
			// TODO: handle exception
		}
	}

}
