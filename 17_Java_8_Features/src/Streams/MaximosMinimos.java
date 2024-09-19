package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximosMinimos {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9,10,4,5,6,8,89,90,58,100,65,34,6);
//		Imperativo		
//		int min = numbers.get(0);
//		for (Integer number : numbers) {
//			if (number < min) {
//				min = number;
//			}
//		}
//		System.out.println(min);
		
		Integer minimo = numbers.stream().min(Comparator.naturalOrder()).get();
		System.out.println(minimo);
	}
}
