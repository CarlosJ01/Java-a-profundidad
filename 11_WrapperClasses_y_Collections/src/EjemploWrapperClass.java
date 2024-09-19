
public class EjemploWrapperClass {

	public static void main(String[] args) {
		int x=10;
//		Integer x1 = new Integer(10);
		Integer x1 = 10;
		
		System.err.println(x);
		System.err.println(x1);
		
		System.out.println(x1.floatValue());
		System.out.println(x1.toString());
		
		String x1String = x1.toString();
		System.out.println(x1String);
	}
}
