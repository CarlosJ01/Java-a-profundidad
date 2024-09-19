package Lambdas.custom;

import java.util.Iterator;

public class Prueba {
	public static void main(String[] args) {
//		Clases anonimas
//		Calculable calculable = new Calculable() {
//			
//			@Override
//			public double avg(double... values) {
//				double sum = 0.0;
//				for (int i = 0; i < values.length; i++) {
//					sum += values[i];
//				}
//				return sum/values.length;
//			}
//		};
		
//		Lambdas
		Calculable calculable = (values) -> {
			double sum = 0.0;
			for (int i = 0; i < values.length; i++) {
				sum += values[i];
			}
			return sum/values.length;
		};
		System.out.println(calculable.avg(10,20,30));
	}
}
