class Mascota {};

class Perro extends Mascota{};
class Gato extends Mascota{};
class Perico extends Mascota{};
class Tortuga extends Mascota{};
class Pez extends Mascota{};
	
public class Excercies {
	
	public static void main(String[] args) {
//		1
		boolean[] ab = {true, false};
		byte[] aby = {1, 2};
		short[] as = {10, 12};
		int[] ai = {100, 200};
		char[] ac = {'a', 'b'};
		float[] af = {10.5f, 11.4f};
		long[] al = {10000000, 2000000};
		double[] ad = {3.1416, 1.3123};
		System.out.println(ab);
		System.out.println(aby);
		System.out.println(as);
		System.out.println(ai);
		System.out.println(ac);
		System.out.println(af);
		System.out.println(al);
		System.out.println(ad);
		
//		2
		int[][] triangulo = {
				{1},
				{2,3},
				{4,5,6}
		};
		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo[i].length; j++) {
				System.out.println(triangulo[i][j]);
			}
		}
		
		
//		3
		Mascota[] mascotas = {
				new Perro(),
				new Gato(),
				new Perico(),
				new Tortuga(),
				new Pez()
		};
		
//		4
		int[][] a1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] a2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] aR = {{0,0,0}, {0,0,0}, {0,0,0}};
		
		for (int i = 0; i < aR.length; i++) {
			for (int j = 0; j < aR.length; j++) {
				aR[i][j] = a1[i][j] + a2[i][j];
				System.out.print(aR[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
