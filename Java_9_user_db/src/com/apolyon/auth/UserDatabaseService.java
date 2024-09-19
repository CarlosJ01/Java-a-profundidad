package com.apolyon.auth;

import java.util.HashMap;
import java.util.Map;

public class UserDatabaseService {
	
	private Map<String, String> users = new HashMap<>();
	
	public UserDatabaseService() {
		users.put("Apolyon", "123");
		users.put("Rainder", "pass");
		users.put("Carlos", "wasd");
	}
	
	public boolean authenticate(String username, String password) {
		String pass = users.get(username);
		return (pass != null && pass.equals(password)) ? true : false;
	}
}
