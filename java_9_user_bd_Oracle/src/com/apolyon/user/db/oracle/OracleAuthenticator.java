package com.apolyon.user.db.oracle;

import java.util.HashMap;
import java.util.Map;

import com.apolyon.user.UserDatabaseAuthentication;

public class OracleAuthenticator implements UserDatabaseAuthentication{
	
	private Map<String, String> users = new HashMap<>();
	
	public OracleAuthenticator() {
		users.put("Apolyon", "123");
		users.put("Rainder", "pass");
		users.put("Carlos", "wasd");
	}
	
	public boolean authenticate(String username, String password) {
		System.out.println("Authentication with oracle");
		String pass = users.get(username);
		return (pass != null && pass.equals(password)) ? true : false;
	}
}
