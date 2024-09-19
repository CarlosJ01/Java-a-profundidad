package paquete2;

import paquete1.EjemploProtected;

public class PruebaEjemploProtected extends EjemploProtected{
	
	void bar() {
		foo();
	}
	
	public static void main(String[] args) {
		PruebaEjemploProtected e = new PruebaEjemploProtected();
		e.foo();
		e.bar();
	}
}
