package com.apolyon.user.db.mysql;

import java.util.HashMap;
import java.util.Map;

import com.apolyon.user.UserDatabaseAuthentication;

public class MySQLAuthenticator implements UserDatabaseAuthentication{
	
	private Map<String, String> users = new HashMap<>();
	
	public MySQLAuthenticator() {
		users.put("Apolyon", "123");
		users.put("Rainder", "pass");
		users.put("Carlos", "wasd");
	}
	
	public boolean authenticate(String username, String password) {
		System.out.println("Autenticando con mySQL");
		String pass = users.get(username);
		return (pass != null && pass.equals(password)) ? true : false;
	}
}
