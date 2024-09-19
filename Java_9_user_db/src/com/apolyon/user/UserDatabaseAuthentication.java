package com.apolyon.user;

public interface UserDatabaseAuthentication {
	public boolean authenticate(String username, String password);
}
