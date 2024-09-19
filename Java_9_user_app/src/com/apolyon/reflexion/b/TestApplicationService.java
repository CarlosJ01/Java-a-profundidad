package com.apolyon.reflexion.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApplicationService {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
//		No se usa por que es default y no public
//		ApplicationService service = new ApplicationService();
		
//		API de reflexion
		try {
//			Optener una clase
			Class<?> className = Class.forName("com.apolyon.reflexion.ApplicationService");
//			Optener el constructor
			Constructor<?> constructor = className.getDeclaredConstructor();
//			Cambiar el acceso de los modificadores
			constructor.setAccessible(true);
//			Crear una instancia
			Object instance = constructor.newInstance();
//			Optener todos los metodos
			Method[] metodos = className.getDeclaredMethods();
			for (Method method : metodos) {
				if (method.getName().equals("sayHello")) {
//					Cambiar el acceso del modificador
					method.setAccessible(true);
//					Ejecutar un metodo por una instancia
					method.invoke(instance);
				}
				System.out.println(method.getName());					
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
