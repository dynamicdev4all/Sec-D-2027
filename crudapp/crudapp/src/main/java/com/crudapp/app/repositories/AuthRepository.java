package com.crudapp.app.repositories;
import java.util.HashMap;
import java.util.Map;
import com.crudapp.app.models.User;

public class AuthRepository {
	
	Map<Long, User> db = new HashMap<Long, User>();
	public User register(User newUser) {
		db.put(newUser.getId(), newUser);
		return newUser;
	}
	
	public User login(Map<String, String> loginUser) {
		long loginId =Long.parseLong(loginUser.get("id"));
		String loginEmail = loginUser.get("email");
		String loginPass = loginUser.get("pass");
		
		//here we are now searching for the user in the database
		
		User user =  db.get(loginId);
		
		if(user.getEmail().equals(loginEmail) && user.getPass().equals(loginPass)) {
			return user;
		}
		else {
			return null;
		}
	}
}
