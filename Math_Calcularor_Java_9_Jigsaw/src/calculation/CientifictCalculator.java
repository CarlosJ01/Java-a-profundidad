package calculation;

import operations.CalculatorProcesors;

// Exponer funcionalidad
public class CientifictCalculator {
	private CalculatorProcesors calculatorProcesors = new CalculatorProcesors();
	
	public int sum (int x, int y) {
		System.out.printf("Sumando %d mas %d \n", x, y);
		return calculatorProcesors.sum(x, y);
	}
}
