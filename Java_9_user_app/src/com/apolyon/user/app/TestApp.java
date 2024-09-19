package com.apolyon.user.app;

import java.util.ServiceLoader;

import com.apolyon.user.UserDatabaseAuthentication;

public class TestApp {
	public static void main(String[] args) {
//		UserDatabaseAuthentication auth = new UserDatabaseAuthentication();
//		System.out.println(auth.authenticate("Carlos", "wasd"));
		
//		Cargar la implementacion
		ServiceLoader<UserDatabaseAuthentication> serviceLoader = ServiceLoader.load(UserDatabaseAuthentication.class);
//		Recorre cada provider del servicio y lo ejecuta
		serviceLoader.forEach(s -> s.authenticate("Carlos", "wasd"));
	}
}
