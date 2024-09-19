package execution;

import calculation.CientifictCalculator;
//import operations.CalculatorProcesors;

public class test {
	public static void main(String[] args) {
		CientifictCalculator calc = new CientifictCalculator();
		System.out.println(calc.sum(10, 20));
		
//		No se puede usar las clases que no estan en los paquetes que se exportaron
//		como paquetes privados y publicos para otros proyectos
//		CalculatorProcesors cp = new CalculatorProcesors();
	}
}
