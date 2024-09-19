package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoverDatosDuplicados {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,3,4,5,3,2,1,2,2,5,100);
		List<Integer> removerDuplicados = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(removerDuplicados);
		
		Set<Integer> sinDuplicados = numbers.stream().collect(Collectors.toSet());
		System.out.println(sinDuplicados);
	}
}
