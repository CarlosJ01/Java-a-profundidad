package Streams;

import java.util.stream.IntStream;

public class PrimitiveStreams {
	public static void main(String[] args) {
//		Imperativo
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		System.out.println("Flujo de datos primitivos");
		IntStream.range(0, 10).forEach(i -> System.out.println(i));
	}
}
